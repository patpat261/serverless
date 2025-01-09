import axios from "axios";

export class UserService {

    apiUrl = "http://host.docker.internal:8080/api/user/users/"

    addCustomer(customer) {
        return axios.post(this.apiUrl + "add", customer);
    }

    login(loginDto) {
        return axios.post("http://172.26.0.11:8080/api/user/auth/login", loginDto);
    }
}