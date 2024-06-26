package com.guido.outcoding.model

fun DatabaseItem(): String{
    val jsonString = """
            [
                {
                    "_id":"2VgBUv9MaBwk5qnK",
                    "tags":["manspreading"],
                    "owner":"null",
                    "createdAt":"Mon Oct 03 2022 07:59:01 GMT+0000 (Coordinated Universal Time)",
                    "updatedAt":"Tue Oct 11 2022 07:52:32 GMT+0000 (Coordinated Universal Time)"
                },
                {
                    "_id":"2bPYDRuvU70sbgja",
                    "tags":["closed eyes", "sleepy", "bed"],
                    "owner":"LeBonk",
                    "createdAt":"Sun Sep 11 2022 00:27:05 GMT+0000 (Coordinated Universal Time)",
                    "updatedAt":"Tue Oct 11 2022 07:52:32 GMT+0000 (Coordinated Universal Time)"
                },
                {
                    "_id":"LTxlBUdATocntNid",
                    "tags":[],
                    "owner":"null",
                    "createdAt":"Thu Jun 30 2022 06:05:15 GMT+0000 (Coordinated Universal Time)",
                    "updatedAt":"Tue Oct 11 2022 07:52:32 GMT+0000 (Coordinated Universal Time)"
                },
                {
                    "_id":"MBpd0f7cDU5EwhZ9",
                    "tags":["tuxedo", "vending machine", "stuck", "glass", "trapped"],
                    "owner":"LeBonk",
                    "createdAt":"Sun Sep 11 2022 00:25:56 GMT+0000 (Coordinated Universal Time)",
                    "updatedAt":"Tue Oct 11 2022 07:52:32 GMT+0000 (Coordinated Universal Time)"
                },
                {
                    "_id":"MkRxexGVMQzEoN73",
                    "tags":[],
                    "owner":"null",
                    "createdAt":"Wed May 18 2022 07:06:08 GMT+0000 (Coordinated Universal Time)",
                    "updatedAt":"Tue Oct 11 2022 07:52:32 GMT+0000 (Coordinated Universal Time)"
                },
                {
                    "_id":"N6pTLrClzF83df8t",
                    "tags":["norwegian forest cat", "daisy", "gaming", "pc"],
                    "owner":"LeBonk",
                    "createdAt":"Sun Sep 11 2022 00:30:31 GMT+0000 (Coordinated Universal Time)",
                    "updatedAt":"Tue Oct 11 2022 07:52:32 GMT+0000 (Coordinated Universal Time)"
                },
                {
                    "_id":"Rn6xqsiHb9B7qgLw",
                    "tags":["small cat", "brazilian", "brazilian cat", "brasileira", "female cat", "female", "black & white", "donna", "londrinense", "londrina", "cute cat", "cute"],
                    "owner":"ricardo.ricardo815",
                    "createdAt":"Wed Sep 28 2022 02:36:22 GMT+0000 (Coordinated Universal Time)",
                    "updatedAt":"Tue Oct 11 2022 07:52:32 GMT+0000 (Coordinated Universal Time)"
                },
                {
                    "_id":"rV1MVEh0Af2Bm4O0",
                    "tags":["kitten", "several", "gif"],
                    "owner":"null",
                    "createdAt":"Sun May 01 2022 20:57:11 GMT+0000 (Coordinated Universal Time)",
                    "updatedAt":"Tue Oct 11 2022 07:52:32 GMT+0000 (Coordinated Universal Time)"
                },
                {
                    "_id":"ZHrXPVRJniYPR6pp",
                    "tags":["gif"],
                    "owner":"null",
                    "createdAt":"Wed Jun 01 2022 22:29:22 GMT+0000 (Coordinated Universal Time)",
                    "updatedAt":"Tue Oct 11 2022 07:52:32 GMT+0000 (Coordinated Universal Time)"
                },
                {
                    "_id":"AYJNTBAktmH3Q7ka",
                    "tags":["gif"],
                    "owner":"null",
                    "createdAt":"Sun May 01 2022 20:54:14 GMT+0000 (Coordinated Universal Time)",
                    "updatedAt":"Tue Oct 11 2022 07:52:32 GMT+0000 (Coordinated Universal Time)"
                }
            ]
        """.trimIndent()

    return jsonString
}