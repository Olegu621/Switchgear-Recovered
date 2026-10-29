.class public Lcom/supercell/titan/AppUpdater;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static a:Lyg3;

.field public static b:Lmc;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a()Z
    .locals 6

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    const v0, 0x1c4

    const-string v2, "LAST_APPUPDATE_REQUESTED"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lcom/supercell/titan/GameApp;->getKeyValue(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x1

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    sub-long/2addr v4, v1

    .line 28
    const-wide/32 v1, 0x5265c00

    .line 29
    .line 30
    .line 31
    cmp-long v1, v4, v1

    .line 32
    .line 33
    if-lez v1, :cond_1

    .line 34
    .line 35
    :goto_0
    return v3

    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    return v1

    .line 38
    :catch_0
    move-exception v2

    .line 39
    new-instance v4, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const v0, 0x1c5

    const-string v5, "APP_UPDATE_REQUESTED_TIME ("

    .line 42
    .line 43
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const v0, 0x1c6

    const-string v1, ") is in invalid format"

    .line 50
    .line 51
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const v0, 0x1c7

    const-string v4, "AppUpdater"

    .line 59
    .line 60
    invoke-static {v4, v1, v2}, Lio/sentry/android/core/n0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    return v3
.end method

.method public static checkUpdate(Lcom/supercell/titan/GameApp;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    const-class v2, Lhe3;

    .line 6
    .line 7
    monitor-enter v2

    .line 8
    :try_start_0
    sget-object v3, Lhe3;->a:Lpi3;

    .line 9
    .line 10
    if-nez v3, :cond_1

    .line 11
    .line 12
    new-instance v3, Lqf3;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    move-object v1, v4

    .line 21
    :cond_0
    invoke-direct {v3, v1}, Lqf3;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Lpi3;

    .line 25
    .line 26
    invoke-direct {v1, v3}, Lpi3;-><init>(Lqf3;)V

    .line 27
    .line 28
    .line 29
    sput-object v1, Lhe3;->a:Lpi3;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v1

    .line 33
    move-object p0, v1

    .line 34
    goto/16 :goto_3

    .line 35
    .line 36
    :cond_1
    :goto_0
    sget-object v1, Lhe3;->a:Lpi3;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    monitor-exit v2

    .line 39
    iget-object v1, v1, Lpi3;->a:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Ljd3;

    .line 42
    .line 43
    invoke-interface {v1}, Ljd3;->zza()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Lyg3;

    .line 48
    .line 49
    sput-object v1, Lcom/supercell/titan/AppUpdater;->a:Lyg3;

    .line 50
    .line 51
    new-instance v2, Lmc;

    .line 52
    .line 53
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    sput-object v2, Lcom/supercell/titan/AppUpdater;->b:Lmc;

    .line 57
    .line 58
    iget-object v2, v1, Lyg3;->a:Lwq3;

    .line 59
    .line 60
    iget-object v1, v1, Lyg3;->c:Landroid/content/Context;

    .line 61
    .line 62
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iget-object v4, v2, Lwq3;->a:Lyr3;

    .line 67
    .line 68
    if-nez v4, :cond_3

    .line 69
    .line 70
    sget-object v1, Lwq3;->e:Lc5;

    .line 71
    .line 72
    const/16 v2, -0x9

    .line 73
    .line 74
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    const v0, 0x1c8

    const-string v4, "onError(%d)"

    .line 83
    .line 84
    const v0, 0x1c9

    const-string v5, "PlayCore"

    .line 85
    .line 86
    const/4 v6, 0x6

    .line 87
    invoke-static {v5, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    if-eqz v6, :cond_2

    .line 92
    .line 93
    iget-object v1, v1, Lc5;->b:Ljava/lang/String;

    .line 94
    .line 95
    invoke-static {v1, v4, v3}, Lc5;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-static {v5, v1}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    :goto_1
    new-instance v1, Lmy0;

    .line 107
    .line 108
    invoke-direct {v1, v2}, Lmy0;-><init>(I)V

    .line 109
    .line 110
    .line 111
    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    goto :goto_2

    .line 116
    :cond_3
    sget-object v3, Lwq3;->e:Lc5;

    .line 117
    .line 118
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    const v0, 0x1ca

    const-string v6, "requestUpdateInfo(%s)"

    .line 123
    .line 124
    invoke-virtual {v3, v6, v5}, Lc5;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    new-instance v5, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 128
    .line 129
    invoke-direct {v5}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 130
    .line 131
    .line 132
    new-instance v7, Lhm3;

    .line 133
    .line 134
    invoke-direct {v7, v2, v5, v1, v5}, Lhm3;-><init>(Lwq3;Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/String;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 135
    .line 136
    .line 137
    new-instance v3, Lhm3;

    .line 138
    .line 139
    const/4 v8, 0x2

    .line 140
    move-object v6, v5

    .line 141
    invoke-direct/range {v3 .. v8}, Lhm3;-><init>(Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Object;I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v4}, Lyr3;->a()Landroid/os/Handler;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-virtual {v1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 149
    .line 150
    .line 151
    invoke-virtual {v5}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    :goto_2
    new-instance v2, Lqc3;

    .line 156
    .line 157
    const/16 v3, 0x9

    .line 158
    .line 159
    invoke-direct {v2, p0, v3}, Lqc3;-><init>(Ljava/lang/Object;I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 163
    .line 164
    .line 165
    new-instance p0, Ln4;

    .line 166
    .line 167
    const/4 v2, 0x7

    .line 168
    invoke-direct {p0, v2}, Ln4;-><init>(I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1, p0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :goto_3
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 176
    throw p0
.end method
