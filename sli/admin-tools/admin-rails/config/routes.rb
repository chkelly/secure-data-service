SLIAdmin::Application.routes.draw do
  resources :realm_management
  post "landing_zone/provision", :to => 'landing_zone#provision'
  get "landing_zone/provision", :to => 'landing_zone#success'
  get "landing_zone", :to => 'landing_zone#index'

  resources :account_managements
  resources :application_authorizations

  get "sessions/new"

  resources :roles
  resources :sessions
  resources :apps
  resources :realms
  match '/apps/approve', :to => 'apps#approve'
  match '/apps/unregister', :to => 'apps#unregister'

  resources :realms do
    member do
      put :update
    end
  end

  get 'developer_approval/does_user_exist/:id', :to => 'developer_approval#does_user_exist'
  post 'developer_approval/submit_user', :to => 'developer_approval#submit_user'
  post 'developer_approval/update_user', :to => 'developer_approval#update_user'
  post 'developer_approval/update_eula_status', :to => 'developer_approval#update_eula_status'
  post 'developer_approval/verify_email', :to => 'developer_approval#verify_email'


  match '/logout', :to => 'sessions#destroy'
  match '/callback', :to => 'application#callback'

  root :to => 'roles#index'

end
