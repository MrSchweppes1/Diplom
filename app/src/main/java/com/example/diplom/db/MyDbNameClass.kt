package com.example.diplom.db

object MyDbNameClass {
    const val DATABASE_VERSION = 1
    const val DATABASE_NAME = "AccountingOfWorkshops.db"

    object MyDbGroups {
        const val TABLE_NAME = "Groups"
        const val Groups_ID = "id"
        const val Groups_GROUPNAME = "groupname"
        const val Groups_SURENAME = "surename"
        const val Groups_NAME = "name"
        const val Groups_PATRONYMIC= "patronymic"

        const val Create_Table = "Create table if not exists $TABLE_NAME (" +
                "$Groups_ID INTEGER PRIMARY KEY autoincrement, $Groups_GROUPNAME TEXT, " +
                " $Groups_SURENAME TEXT, $Groups_NAME TEXT, $Groups_PATRONYMIC TEXT)"
        const val Drop_Table = "DROP TABLE IF EXISTS $TABLE_NAME"
    }


    object MyDbEquipment {
        const val TABLE_NAME = "Equipment"
        const val Equipment_ID = "id"
        const val Equipment_TitleEquip = "title_equip"
        const val Equipment_SUBTITLE = "subtitle"

        const val Create_Table = "Create table if not exists $TABLE_NAME (" +
                "$Equipment_ID INTEGER PRIMARY KEY autoincrement, $Equipment_TitleEquip TEXT, " +
                " $Equipment_SUBTITLE TEXT)"
        const val Drop_Table = "DROP TABLE IF EXISTS $TABLE_NAME"
    }


    object MydbEvent {
        const val TABLE_NAME_EventList = "EventList"
        const val EventList_ID = "id"
        const val EventList_Workshops = "workshops"
        const val EventList_LessonType = "lessonType"
        const val EventList_Topic = "topic"
        const val EventList_Exercise = "exercise"
        const val EventList_Criteria = "criteria"
        const val EventList_GroupNameID = "groupnameID"
        const val EventList_Date = "date"
        const val EventList_EquipmentName = "equipmentName"
        const val EventList_EquipmentCount = "equipmentCount"

        const val Create_Table = "Create table if not exists $TABLE_NAME_EventList (" +
                "$EventList_ID INTEGER PRIMARY KEY autoincrement, $EventList_Workshops TEXT" +
                "$EventList_LessonType TEXT, $EventList_Topic TEXT, " +
                "$EventList_Exercise TEXT, $EventList_Criteria TEXT, " +
                "$EventList_GroupNameID INTEGER , $EventList_Date DATE, " +
                "$EventList_EquipmentName TEXT, $EventList_EquipmentCount INTEGER)"
        const val Drop_Table = "DROP TABLE IF EXISTS $TABLE_NAME_EventList"
    }
}