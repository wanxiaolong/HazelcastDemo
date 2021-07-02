package com.demo.hazelcast;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;

import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Arrays;

public class HazelClient {
    public static void main(String[] args) {
        ClientConfig config = new ClientConfig();
        HazelcastInstance instance = HazelcastClient.newHazelcastClient(config);
        // Map
        Map<String, String> map = instance.getMap("MyMap");
        System.out.println(Arrays.toString(map.entrySet().toArray()));

        // List
        List<String> list = instance.getList("MyList");
        System.out.println(Arrays.toString(list.toArray()));

        // Set
        Set<String> set = instance.getSet("MySet");
        System.out.println(Arrays.toString(set.toArray()));

        // Queue
        Queue<String> queue = instance.getQueue("MyQueue");
        String s1 = queue.poll();
        String s2 = queue.poll();
        System.out.println("s1=" + s1 + ", s2=" + s2);
    }
}
