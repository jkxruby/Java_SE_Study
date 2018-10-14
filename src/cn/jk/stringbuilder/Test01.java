package cn.jk.stringbuilder;

/**
 * Created by jkx on 2018/10/14.
 */
public class Test01 {    // 正常情况下用 StringBulider即可， StringBuffer很少用到
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();  // 字符数组长度初始值为 16
        StringBuilder sb1 = new StringBuilder(32);
        StringBuilder sb2 = new StringBuilder("abcd");
        sb2.append("efg");
        sb2.append(true).append(321).append("随便"); // 通过return this 实现方法链

        System.out.println("#######");

        StringBuilder gh = new StringBuilder("a");
        System.out.println(gh);

        for (int i=0; i<10; i++){
            gh.append(i);
        }
        System.out.println(gh);


// 测试数组的用法，并查找一个数组中最大数，其实和python、ruby 很类似，程序语言之间万变不离其宗
        double[] myList = {1.2, 3.4, 2.1, 5.3, 7.5};
        // 查找最大元素
        double max = myList[0];
        for(int i = 1; i< myList.length; i++){  //for(X;X;X) xxx隔开的是; 而不是,注意区分
            if(myList[i] > max)
                max = myList[i];

        }
        System.out.println(max);
    }
}