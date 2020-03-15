import axios from 'axios';
 

const API_URL = 'http://localhost:8080/api/work/all/';

class WorkService {
    constructor() {
        UserService.currentUser.subscribe(data => {
            this.headers = {
                'Content-Type':'application/json',
                'authorization':'Bearer ' + (data ? data.token:'')
            };
        });
    }

    getAllWork() {
        return axios.get(API_URL + 'all', {headers: this.headers});
    }
}

export default new WorkService();