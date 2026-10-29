.class public Lcom/supercell/titan/PushMessageService;
.super Lcom/google/firebase/messaging/FirebaseMessagingService;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final synthetic b:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessagingService;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static getToken(Z)V
    .locals 5

    .line 1
    const v0, 0x93

    const-string v1, ""

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    :try_start_0
    const-class p0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 6
    .line 7
    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    :try_start_1
    invoke-static {}, Lvi0;->c()Lvi0;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-static {v2}, Lcom/google/firebase/messaging/FirebaseMessaging;->getInstance(Lvi0;)Lcom/google/firebase/messaging/FirebaseMessaging;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 13
    .line 14
    .line 15
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0

    .line 16
    const-class p0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 17
    .line 18
    monitor-enter p0

    .line 19
    :try_start_3
    invoke-static {}, Lvi0;->c()Lvi0;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1}, Lcom/google/firebase/messaging/FirebaseMessaging;->getInstance(Lvi0;)Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 24
    .line 25
    .line 26
    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 27
    monitor-exit p0

    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance p0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 32
    .line 33
    invoke-direct {p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 34
    .line 35
    .line 36
    iget-object v2, v1, Lcom/google/firebase/messaging/FirebaseMessaging;->f:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 37
    .line 38
    new-instance v3, Lj8;

    .line 39
    .line 40
    const/16 v4, 0x18

    .line 41
    .line 42
    invoke-direct {v3, v4, v1, p0}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    new-instance v1, Lds0;

    .line 53
    .line 54
    const/16 v2, 0x17

    .line 55
    .line 56
    invoke-direct {v1, v2}, Lds0;-><init>(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :catchall_0
    move-exception v1

    .line 64
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 65
    throw v1

    .line 66
    :catchall_1
    move-exception v2

    .line 67
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 68
    :try_start_6
    throw v2
    :try_end_6
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_0

    .line 69
    :catch_0
    move-exception p0

    .line 70
    const v0, 0x94

    const-string v2, "FirebaseService"

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-static {v2, p0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    const/4 p0, -0x1

    .line 80
    const v0, 0x95

    const-string v2, "Firebase not initialized"

    .line 81
    .line 82
    invoke-static {p0, v1, v2}, Lcom/supercell/titan/GameApp;->queuePushNotificationValueUpdate(ILjava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_0
    const/4 p0, -0x2

    .line 87
    const v0, 0x96

    const-string v2, "Player didn\'t grant push notification permission"

    .line 88
    .line 89
    invoke-static {p0, v1, v2}, Lcom/supercell/titan/GameApp;->queuePushNotificationValueUpdate(ILjava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public static hasPermissionBeenRequested()Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const v2, 0x97

    const-string v2, "titan_push_prefs"

    .line 10
    .line 11
    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const v2, 0x98

    const-string v2, "push_permission_requested"

    .line 16
    .line 17
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0
.end method

.method public static isPermissionGranted()Z
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-lt v0, v1, :cond_1

    .line 7
    .line 8
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const v1, 0x99

    const-string v1, "android.permission.POST_NOTIFICATIONS"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lv00;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    return v2

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return v0

    .line 23
    :cond_1
    return v2
.end method

.method public static onDestroy(Lcom/supercell/titan/GameApp;)V
    .locals 0

    .line 1
    return-void
.end method

.method public static register()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/supercell/titan/PushMessageService;->requestToken()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static requestPermission(Lcom/supercell/titan/RequestPermissionListener;)V
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-lt v0, v1, :cond_1

    .line 7
    .line 8
    invoke-static {}, Lcom/supercell/titan/PushMessageService;->isPermissionGranted()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {p0, v2}, Lcom/supercell/titan/RequestPermissionListener;->onPermissionResult(Z)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const v1, 0x9a

    const-string v1, "titan_push_prefs"

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-virtual {v0, v1, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const v3, 0x9b

    const-string v3, "push_permission_requested"

    .line 34
    .line 35
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 40
    .line 41
    .line 42
    new-instance v1, Lcom/supercell/titan/i;

    .line 43
    .line 44
    invoke-direct {v1, p0}, Lcom/supercell/titan/i;-><init>(Lcom/supercell/titan/RequestPermissionListener;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lcom/supercell/titan/GameApp;->addActivityEventListener(Lcom/supercell/titan/GameApp$ActivityEventListener;)V

    .line 48
    .line 49
    .line 50
    const p0, 0x9c

    const-string p0, "android.permission.POST_NOTIFICATIONS"

    .line 51
    .line 52
    filled-new-array {p0}, [Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    const v1, 0xef422

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p0, v1}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_1
    invoke-interface {p0, v2}, Lcom/supercell/titan/RequestPermissionListener;->onPermissionResult(Z)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public static requestToken()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lds0;

    .line 8
    .line 9
    const/16 v1, 0x18

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lds0;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/supercell/titan/PushMessageService;->requestPermission(Lcom/supercell/titan/RequestPermissionListener;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public static shouldShowPermissionRationale()Z
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-lt v0, v1, :cond_1

    .line 7
    .line 8
    invoke-static {}, Lcom/supercell/titan/PushMessageService;->isPermissionGranted()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return v2

    .line 15
    :cond_0
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const v1, 0x9d

    const-string v1, "android.permission.POST_NOTIFICATIONS"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    return v0

    .line 26
    :cond_1
    return v2
.end method


# virtual methods
.method public onMessageReceived(Lcom/google/firebase/messaging/RemoteMessage;)V
    .locals 28

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/firebase/messaging/RemoteMessage;->a:Landroid/os/Bundle;

    .line 4
    .line 5
    const v27, 0x9e

    const-string v2, "from"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/google/firebase/messaging/RemoteMessage;->D1()Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    move-object v2, v1

    .line 15
    check-cast v2, Lle2;

    .line 16
    .line 17
    const v27, 0x9f

    const-string v3, "origin"

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Lle2;->containsKey(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    move-object v2, v1

    .line 28
    check-cast v2, Lle2;

    .line 29
    .line 30
    invoke-virtual {v2, v3, v5}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const v27, 0xa0

    const-string v3, "helpshift"

    .line 35
    .line 36
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-nez v0, :cond_0

    .line 47
    .line 48
    const v27, 0xa1

    const-string v0, "FirebaseService"

    .line 49
    .line 50
    const v27, 0xa2

    const-string v1, "Cannot handle Helpshift push message, GameApp instance is null"

    .line 51
    .line 52
    invoke-static {v0, v1}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    sget v2, Lcom/supercell/titan/R$string;->helpshift_apiKey:I

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    sget v3, Lcom/supercell/titan/R$string;->helpshift_domain:I

    .line 71
    .line 72
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    sget v5, Lcom/supercell/titan/R$string;->helpshift_appId:I

    .line 81
    .line 82
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-static {v0, v2, v3, v4}, Lcom/supercell/titan/HelpshiftTitan;->start(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 87
    .line 88
    .line 89
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    new-instance v2, Lye;

    .line 94
    .line 95
    const/16 v3, 0x14

    .line 96
    .line 97
    invoke-direct {v2, v1, v3}, Lye;-><init>(Ljava/lang/Object;I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 101
    .line 102
    .line 103
    invoke-static {}, Lcom/supercell/titan/HelpshiftTitan;->requestNotificationCount()V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_1
    invoke-virtual {v0}, Lcom/google/firebase/messaging/RemoteMessage;->D1()Ljava/util/Map;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-static {}, Lcom/supercell/titan/TitanApplication;->isInForeground()Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    move-object/from16 v6, p0

    .line 116
    .line 117
    invoke-static {v6, v2, v3}, Lcom/supercell/titan/zendesk/ZendeskKt;->tryConsumePushNotification(Landroid/content/Context;Ljava/util/Map;Z)Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-eqz v2, :cond_2

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_2
    invoke-virtual {v6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    :try_start_0
    const v27, 0xa3

    const-string v3, "com.supercell.titan.braze.BrazeKt"

    .line 129
    .line 130
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    const v27, 0xa4

    const-string v7, "tryConsumePushNotification"

    .line 135
    .line 136
    const-class v8, Landroid/content/Context;

    .line 137
    .line 138
    const-class v9, Lcom/google/firebase/messaging/RemoteMessage;

    .line 139
    .line 140
    filled-new-array {v8, v9}, [Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-result-object v8

    .line 144
    invoke-virtual {v3, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-virtual {v3, v5, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    instance-of v3, v2, Ljava/lang/Boolean;

    .line 157
    .line 158
    if-eqz v3, :cond_3

    .line 159
    .line 160
    check-cast v2, Ljava/lang/Boolean;

    .line 161
    .line 162
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 163
    .line 164
    .line 165
    move-result v2
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 166
    if-eqz v2, :cond_3

    .line 167
    .line 168
    :goto_0
    return-void

    .line 169
    :catch_0
    :catchall_0
    :cond_3
    move-object v2, v1

    .line 170
    check-cast v2, Lle2;

    .line 171
    .line 172
    invoke-virtual {v2}, Lle2;->isEmpty()Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-nez v3, :cond_4

    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    :cond_4
    new-instance v3, Ljava/util/HashMap;

    .line 182
    .line 183
    invoke-direct {v3, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 184
    .line 185
    .line 186
    const v27, 0xa5

    const-string v1, "fcmV1Message"

    .line 187
    .line 188
    invoke-virtual {v2, v1, v5}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    check-cast v7, Ljava/lang/String;

    .line 193
    .line 194
    invoke-static {v7}, Ljb1;->v(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    const v27, 0xa6

    const-string v8, "message"

    .line 199
    .line 200
    const v27, 0xa7

    const-string v9, "data"

    .line 201
    .line 202
    if-eqz v7, :cond_5

    .line 203
    .line 204
    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    if-eqz v7, :cond_5

    .line 209
    .line 210
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 211
    .line 212
    .line 213
    move-result-object v7

    .line 214
    invoke-static {v7, v3}, Ljb1;->t(Lorg/json/JSONObject;Ljava/util/HashMap;)V

    .line 215
    .line 216
    .line 217
    :cond_5
    invoke-virtual {v2, v9, v5}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v7

    .line 221
    check-cast v7, Ljava/lang/String;

    .line 222
    .line 223
    invoke-static {v7}, Ljb1;->v(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 224
    .line 225
    .line 226
    move-result-object v7

    .line 227
    invoke-static {v7, v3}, Ljb1;->t(Lorg/json/JSONObject;Ljava/util/HashMap;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2, v1, v5}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    check-cast v1, Ljava/lang/String;

    .line 235
    .line 236
    invoke-static {v1}, Ljb1;->v(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    if-eqz v1, :cond_6

    .line 241
    .line 242
    invoke-virtual {v1, v8}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    goto :goto_1

    .line 247
    :cond_6
    move-object v1, v5

    .line 248
    :goto_1
    const v27, 0xa8

    const-string v7, "notification"

    .line 249
    .line 250
    if-eqz v1, :cond_7

    .line 251
    .line 252
    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    goto :goto_2

    .line 257
    :cond_7
    move-object v1, v5

    .line 258
    :goto_2
    invoke-virtual {v2, v7, v5}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    check-cast v2, Ljava/lang/String;

    .line 263
    .line 264
    invoke-static {v2}, Ljb1;->v(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    invoke-virtual {v0}, Lcom/google/firebase/messaging/RemoteMessage;->E1()Ltf;

    .line 269
    .line 270
    .line 271
    move-result-object v7

    .line 272
    if-eqz v7, :cond_8

    .line 273
    .line 274
    iget-object v8, v7, Ltf;->a:Ljava/lang/String;

    .line 275
    .line 276
    goto :goto_3

    .line 277
    :cond_8
    move-object v8, v5

    .line 278
    :goto_3
    const v27, 0xa9

    const-string v9, "title"

    .line 279
    .line 280
    invoke-static {v9, v1}, Ljb1;->E(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v10

    .line 284
    invoke-static {v9, v2}, Ljb1;->E(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v11

    .line 288
    invoke-virtual {v3, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v12

    .line 292
    check-cast v12, Ljava/lang/String;

    .line 293
    .line 294
    filled-new-array {v8, v10, v11, v12}, [Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v8

    .line 298
    move v10, v4

    .line 299
    :goto_4
    const/4 v11, 0x4

    .line 300
    if-ge v10, v11, :cond_c

    .line 301
    .line 302
    aget-object v12, v8, v10

    .line 303
    .line 304
    if-eqz v12, :cond_9

    .line 305
    .line 306
    invoke-virtual {v12}, Ljava/lang/String;->isEmpty()Z

    .line 307
    .line 308
    .line 309
    move-result v13

    .line 310
    if-eqz v13, :cond_a

    .line 311
    .line 312
    :cond_9
    move-object v12, v5

    .line 313
    :cond_a
    if-eqz v12, :cond_b

    .line 314
    .line 315
    move-object v13, v12

    .line 316
    goto :goto_5

    .line 317
    :cond_b
    add-int/lit8 v10, v10, 0x1

    .line 318
    .line 319
    goto :goto_4

    .line 320
    :cond_c
    move-object v13, v5

    .line 321
    :goto_5
    if-eqz v7, :cond_d

    .line 322
    .line 323
    iget-object v7, v7, Ltf;->b:Ljava/lang/String;

    .line 324
    .line 325
    goto :goto_6

    .line 326
    :cond_d
    move-object v7, v5

    .line 327
    :goto_6
    const v27, 0xaa

    const-string v8, "body"

    .line 328
    .line 329
    invoke-static {v8, v1}, Ljb1;->E(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    invoke-static {v8, v2}, Ljb1;->E(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    invoke-virtual {v3, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v8

    .line 341
    check-cast v8, Ljava/lang/String;

    .line 342
    .line 343
    filled-new-array {v7, v1, v2, v8}, [Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    move v2, v4

    .line 348
    :goto_7
    if-ge v2, v11, :cond_11

    .line 349
    .line 350
    aget-object v7, v1, v2

    .line 351
    .line 352
    if-eqz v7, :cond_e

    .line 353
    .line 354
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 355
    .line 356
    .line 357
    move-result v8

    .line 358
    if-eqz v8, :cond_f

    .line 359
    .line 360
    :cond_e
    move-object v7, v5

    .line 361
    :cond_f
    if-eqz v7, :cond_10

    .line 362
    .line 363
    move-object v12, v7

    .line 364
    goto :goto_8

    .line 365
    :cond_10
    add-int/lit8 v2, v2, 0x1

    .line 366
    .line 367
    goto :goto_7

    .line 368
    :cond_11
    move-object v12, v5

    .line 369
    :goto_8
    invoke-virtual {v0}, Lcom/google/firebase/messaging/RemoteMessage;->E1()Ltf;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    if-eqz v1, :cond_12

    .line 374
    .line 375
    invoke-virtual {v0}, Lcom/google/firebase/messaging/RemoteMessage;->E1()Ltf;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    iget-object v1, v1, Ltf;->c:Ljava/lang/String;

    .line 380
    .line 381
    move-object v14, v1

    .line 382
    goto :goto_9

    .line 383
    :cond_12
    move-object v14, v5

    .line 384
    :goto_9
    const v27, 0xab

    const-string v1, "userId"

    .line 385
    .line 386
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    move-object v15, v1

    .line 391
    check-cast v15, Ljava/lang/String;

    .line 392
    .line 393
    const v27, 0xac

    const-string v1, "channelId"

    .line 394
    .line 395
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    move-object/from16 v17, v1

    .line 400
    .line 401
    check-cast v17, Ljava/lang/String;

    .line 402
    .line 403
    const v27, 0xad

    const-string v1, "channelName"

    .line 404
    .line 405
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    move-object/from16 v18, v1

    .line 410
    .line 411
    check-cast v18, Ljava/lang/String;

    .line 412
    .line 413
    const v27, 0xae

    const-string v1, "channelDesc"

    .line 414
    .line 415
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    move-object/from16 v19, v1

    .line 420
    .line 421
    check-cast v19, Ljava/lang/String;

    .line 422
    .line 423
    const v27, 0xaf

    const-string v1, "imageURL"

    .line 424
    .line 425
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    move-object/from16 v16, v1

    .line 430
    .line 431
    check-cast v16, Ljava/lang/String;

    .line 432
    .line 433
    const v27, 0xb0

    const-string v1, "color"

    .line 434
    .line 435
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    check-cast v1, Ljava/lang/String;

    .line 440
    .line 441
    const v27, 0xb1

    const-string v2, "iconResourceName"

    .line 442
    .line 443
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    move-object/from16 v20, v2

    .line 448
    .line 449
    check-cast v20, Ljava/lang/String;

    .line 450
    .line 451
    const v27, 0xb2

    const-string v2, "chronosPushNotificationId"

    .line 452
    .line 453
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    move-object/from16 v23, v2

    .line 458
    .line 459
    check-cast v23, Ljava/lang/String;

    .line 460
    .line 461
    const v27, 0xb3

    const-string v2, "notificationUniqueId"

    .line 462
    .line 463
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    check-cast v2, Ljava/lang/String;

    .line 468
    .line 469
    const v27, 0xb4

    const-string v7, "source"

    .line 470
    .line 471
    invoke-virtual {v3, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v3

    .line 475
    check-cast v3, Ljava/lang/String;

    .line 476
    .line 477
    if-eqz v3, :cond_13

    .line 478
    .line 479
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 480
    .line 481
    .line 482
    move-result v7

    .line 483
    if-eqz v7, :cond_14

    .line 484
    .line 485
    :cond_13
    move-object v3, v5

    .line 486
    :cond_14
    if-eqz v2, :cond_16

    .line 487
    .line 488
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 489
    .line 490
    .line 491
    move-result v7

    .line 492
    if-eqz v7, :cond_15

    .line 493
    .line 494
    goto :goto_b

    .line 495
    :cond_15
    :goto_a
    move-object/from16 v24, v2

    .line 496
    .line 497
    goto :goto_c

    .line 498
    :cond_16
    :goto_b
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 499
    .line 500
    .line 501
    move-result-object v2

    .line 502
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v2

    .line 506
    goto :goto_a

    .line 507
    :goto_c
    if-eqz v3, :cond_17

    .line 508
    .line 509
    const v27, 0xb5

    const-string v2, "social"

    .line 510
    .line 511
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 512
    .line 513
    .line 514
    move-result v2

    .line 515
    if-eqz v2, :cond_17

    .line 516
    .line 517
    sget-object v2, Lcom/supercell/titan/GameApp$NotificationSource;->SOCIAL:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 518
    .line 519
    iget v2, v2, Lcom/supercell/titan/GameApp$NotificationSource;->a:I

    .line 520
    .line 521
    :goto_d
    move/from16 v22, v2

    .line 522
    .line 523
    goto :goto_10

    .line 524
    :cond_17
    if-eqz v23, :cond_19

    .line 525
    .line 526
    invoke-virtual/range {v23 .. v23}, Ljava/lang/String;->isEmpty()Z

    .line 527
    .line 528
    .line 529
    move-result v2

    .line 530
    if-eqz v2, :cond_18

    .line 531
    .line 532
    goto :goto_e

    .line 533
    :cond_18
    move-object/from16 v2, v23

    .line 534
    .line 535
    goto :goto_f

    .line 536
    :cond_19
    :goto_e
    move-object v2, v5

    .line 537
    :goto_f
    if-eqz v2, :cond_1a

    .line 538
    .line 539
    sget-object v2, Lcom/supercell/titan/GameApp$NotificationSource;->CHRONOS:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 540
    .line 541
    iget v2, v2, Lcom/supercell/titan/GameApp$NotificationSource;->a:I

    .line 542
    .line 543
    goto :goto_d

    .line 544
    :cond_1a
    sget-object v2, Lcom/supercell/titan/GameApp$NotificationSource;->SERVER:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 545
    .line 546
    iget v2, v2, Lcom/supercell/titan/GameApp$NotificationSource;->a:I

    .line 547
    .line 548
    goto :goto_d

    .line 549
    :goto_10
    if-eqz v1, :cond_1c

    .line 550
    .line 551
    :try_start_1
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 552
    .line 553
    .line 554
    move-result v4
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 555
    :catch_1
    :cond_1b
    :goto_11
    move/from16 v21, v4

    .line 556
    .line 557
    goto :goto_12

    .line 558
    :cond_1c
    invoke-virtual {v0}, Lcom/google/firebase/messaging/RemoteMessage;->E1()Ltf;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    if-eqz v1, :cond_1b

    .line 563
    .line 564
    invoke-virtual {v0}, Lcom/google/firebase/messaging/RemoteMessage;->E1()Ltf;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    iget-object v0, v0, Ltf;->d:Ljava/lang/String;

    .line 569
    .line 570
    if-eqz v0, :cond_1b

    .line 571
    .line 572
    :try_start_2
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 573
    .line 574
    .line 575
    move-result v4
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 576
    goto :goto_11

    .line 577
    :goto_12
    if-eqz v12, :cond_1d

    .line 578
    .line 579
    invoke-virtual {v12}, Ljava/lang/String;->isEmpty()Z

    .line 580
    .line 581
    .line 582
    move-result v0

    .line 583
    if-nez v0, :cond_1d

    .line 584
    .line 585
    invoke-virtual {v6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 586
    .line 587
    .line 588
    move-result-object v11

    .line 589
    :try_start_3
    invoke-virtual {v6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    invoke-virtual {v6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 598
    .line 599
    .line 600
    move-result-object v1

    .line 601
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 602
    .line 603
    .line 604
    move-result-object v1

    .line 605
    invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    invoke-virtual {v0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    invoke-virtual {v0}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 618
    .line 619
    .line 620
    move-result-object v5
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 621
    :catch_2
    move-object/from16 v25, v5

    .line 622
    .line 623
    const/16 v26, 0x0

    .line 624
    .line 625
    invoke-static/range {v11 .. v26}, Lcom/supercell/titan/TimeAlarm;->createNotification(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Class;Landroid/app/Service;)V

    .line 626
    .line 627
    .line 628
    :cond_1d
    move/from16 v1, v22

    .line 629
    .line 630
    move-object/from16 v2, v23

    .line 631
    .line 632
    move-object/from16 v0, v24

    .line 633
    .line 634
    new-instance v3, Lcom/supercell/titan/GameApp$NotificationData;

    .line 635
    .line 636
    invoke-direct {v3}, Lcom/supercell/titan/GameApp$NotificationData;-><init>()V

    .line 637
    .line 638
    .line 639
    const v27, 0xb6

    const-string v4, ""

    .line 640
    .line 641
    if-eqz v12, :cond_1e

    .line 642
    .line 643
    goto :goto_13

    .line 644
    :cond_1e
    move-object v12, v4

    .line 645
    :goto_13
    iput-object v12, v3, Lcom/supercell/titan/GameApp$NotificationData;->message:Ljava/lang/String;

    .line 646
    .line 647
    if-eqz v13, :cond_1f

    .line 648
    .line 649
    goto :goto_14

    .line 650
    :cond_1f
    move-object v13, v4

    .line 651
    :goto_14
    iput-object v13, v3, Lcom/supercell/titan/GameApp$NotificationData;->title:Ljava/lang/String;

    .line 652
    .line 653
    iput-object v0, v3, Lcom/supercell/titan/GameApp$NotificationData;->notificationId:Ljava/lang/String;

    .line 654
    .line 655
    if-eqz v17, :cond_20

    .line 656
    .line 657
    move-object/from16 v4, v17

    .line 658
    .line 659
    :cond_20
    iput-object v4, v3, Lcom/supercell/titan/GameApp$NotificationData;->channelId:Ljava/lang/String;

    .line 660
    .line 661
    iput v1, v3, Lcom/supercell/titan/GameApp$NotificationData;->source:I

    .line 662
    .line 663
    iput-object v2, v3, Lcom/supercell/titan/GameApp$NotificationData;->chronosEventId:Ljava/lang/String;

    .line 664
    .line 665
    invoke-static {v3}, Lcom/supercell/titan/GameApp;->trackNotificationReceivedOnly(Lcom/supercell/titan/GameApp$NotificationData;)V

    .line 666
    .line 667
    .line 668
    invoke-static {v3}, Lcom/supercell/titan/GameApp;->addDisplayedNotificationForCancelTracking(Lcom/supercell/titan/GameApp$NotificationData;)V

    .line 669
    .line 670
    .line 671
    return-void
.end method

.method public onNewToken(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 p0, 0x0

    .line 2
    const v0, 0xb7

    const-string v0, ""

    .line 3
    .line 4
    invoke-static {p0, p1, v0}, Lcom/supercell/titan/GameApp;->queuePushNotificationValueUpdate(ILjava/lang/String;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
