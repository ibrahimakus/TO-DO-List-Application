import Vue from 'vue'
import Router from 'vue-router'
import Login from './views/Login.vue'
import Register from './views/Register.vue'
import Profile from './views/Profile.vue'
 
import NotFound from './views/NotFound.vue'
 
 
import UserService from './services/user.service'

Vue.use(Router)

const router = new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [ 
    {
      path: '/',
      name: 'login',
      component: Login
    },
    {
      path: '/login',
      component: Login
    },
    {
      path: '/register',
      component: Register
    },    
    {
      path: '/profile',
      component: Profile,
      
    },   
    {
      path: '/404',
      component: NotFound
    }, 
    {
      path: '*', redirect: '/404'
    }
  ]
});

router.beforeEach((to, from, next) => {
  
  const currentUser = UserService.currentUserValue;
    if (!currentUser) {
      return next({ path: '/login' });
    } 
  next();
});
export default router;