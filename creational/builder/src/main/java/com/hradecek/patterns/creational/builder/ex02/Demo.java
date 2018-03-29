package com.hradecek.patterns.creational.builder.ex02;

class Demo {

    public static void main(String[] args) throws Exception {
        Task task = new TaskBuilder(5).setDescription("Hello").setSummary("Test").build();
        System.out.println(task);
    }
}
