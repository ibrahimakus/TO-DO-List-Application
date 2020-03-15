<template>
    <div class="container">
        <div class="user-container">
            <div class="card">
                <div class="card-header">
                    <div class="row">
                        <div class="col col-xs-6">
                            <h3 class="panel-title">All Users</h3>
                        </div>
                    </div>
                </div>
                <div class="card-body">
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th scope="col">#</th>
                                <th scope="col">Name</th>
                                <th scope="col">Description</th>
                                <th scope="col">Deadline</th>
                                <th scope="col">Status</th>
                                <th scope="col">Create Date</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr v-for="(item, index) in workList" v-bind:key="item.id">
                                <th scope="row">{{index}}</th>
                                <td>{{item.name}}</td>
                                <td>{{item.description}}</td>
                                <td>{{item.deadline}}</td>
                                <td>{{item.status}}</td>
                                <td>{{item.createDate}}</td>
                                <td>
                                    <button class="btn btn-info"
                                    @click="choose(item)">Choose Work</button>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
import workService from '../services/work.service';

export default {
    name: 'workList',
    data() {
        return {
            workList: []
        };
    },
    created() {
        workService.getAllWork().then(work => {
            this.workList = work.data;
        });
    },
    methods: {
        choose(item) {
            localStorage.setItem('selectedWork', JSON.stringify(item));
            this.$router.push({name: 'selectedWorkList', params: {id: item.id}});
        }
    }
}
</script>
<style>

</style>

