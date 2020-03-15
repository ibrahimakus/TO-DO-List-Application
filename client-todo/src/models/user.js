export default class User {
    constructor(username, password, name, token, id) {
        this.username = username;
        this.password = password;
        this.name = name;        
        this.token = token;
        this.id = id;
    }
}