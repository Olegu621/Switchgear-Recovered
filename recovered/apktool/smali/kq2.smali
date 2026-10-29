.class public final Lkq2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final i:Ljava/lang/Object;

.field public static v:Ljava/lang/Boolean;

.field public static w:Ljava/lang/Boolean;


# instance fields
.field public final synthetic a:I

.field public final b:J

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkq2;->i:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Liq2;Landroid/content/Context;Lsz;J)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lkq2;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lkq2;->f:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lkq2;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iput-wide p4, p0, Lkq2;->b:J

    .line 12
    .line 13
    iput-object p3, p0, Lkq2;->d:Ljava/lang/Object;

    .line 14
    .line 15
    const-string p1, "power"

    .line 16
    .line 17
    invoke-virtual {p2, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Landroid/os/PowerManager;

    .line 22
    .line 23
    const/4 p2, 0x1

    .line 24
    const-string p3, "wake:com.google.firebase.messaging"

    .line 25
    .line 26
    invoke-virtual {p1, p2, p3}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lkq2;->e:Ljava/lang/Object;

    .line 31
    .line 32
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;JI)V
    .locals 0

    .line 34
    iput p7, p0, Lkq2;->a:I

    iput-object p2, p0, Lkq2;->c:Ljava/lang/Object;

    iput-object p3, p0, Lkq2;->d:Ljava/lang/Object;

    iput-object p4, p0, Lkq2;->e:Ljava/lang/Object;

    iput-wide p5, p0, Lkq2;->b:J

    iput-object p1, p0, Lkq2;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Llm3;Landroid/os/Bundle;Lbm3;Lbm3;J)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lkq2;->a:I

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lkq2;->c:Ljava/lang/Object;

    iput-object p3, p0, Lkq2;->d:Ljava/lang/Object;

    iput-object p4, p0, Lkq2;->e:Ljava/lang/Object;

    iput-wide p5, p0, Lkq2;->b:J

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lkq2;->f:Ljava/lang/Object;

    return-void
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 3

    .line 1
    sget-object v0, Lkq2;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lkq2;->w:Ljava/lang/Boolean;

    .line 5
    .line 6
    if-nez v1, :cond_2

    .line 7
    .line 8
    const-string v2, "android.permission.ACCESS_NETWORK_STATE"

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0, v2}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 p0, 0x0

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_1

    .line 29
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    sput-object v1, Lkq2;->w:Ljava/lang/Boolean;

    .line 38
    .line 39
    monitor-exit v0

    .line 40
    return p0

    .line 41
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    throw p0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 3

    .line 1
    sget-object v0, Lkq2;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lkq2;->v:Ljava/lang/Boolean;

    .line 5
    .line 6
    if-nez v1, :cond_2

    .line 7
    .line 8
    const-string v2, "android.permission.WAKE_LOCK"

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0, v2}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 p0, 0x0

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_1

    .line 29
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    sput-object v1, Lkq2;->v:Ljava/lang/Boolean;

    .line 38
    .line 39
    monitor-exit v0

    .line 40
    return p0

    .line 41
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    throw p0
.end method


# virtual methods
.method public declared-synchronized c()Z
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lkq2;->c:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Landroid/content/Context;

    .line 5
    .line 6
    const-string v1, "connectivity"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto :goto_2

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    :goto_0
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 27
    .line 28
    .line 29
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const/4 v0, 0x0

    .line 35
    :goto_1
    monitor-exit p0

    .line 36
    return v0

    .line 37
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    throw v0
.end method

.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lkq2;->a:I

    .line 4
    .line 5
    iget-wide v2, v0, Lkq2;->b:J

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x0

    .line 9
    iget-object v6, v0, Lkq2;->e:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v7, v0, Lkq2;->d:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v8, v0, Lkq2;->c:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v9, v0, Lkq2;->f:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object v10, v9

    .line 21
    check-cast v10, Llm3;

    .line 22
    .line 23
    check-cast v8, Landroid/os/Bundle;

    .line 24
    .line 25
    move-object v11, v7

    .line 26
    check-cast v11, Lbm3;

    .line 27
    .line 28
    move-object v12, v6

    .line 29
    check-cast v12, Lbm3;

    .line 30
    .line 31
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const-string v1, "screen_name"

    .line 35
    .line 36
    invoke-virtual {v8, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v1, "screen_class"

    .line 40
    .line 41
    invoke-virtual {v8, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object v1, v10, Lsq3;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Lij3;

    .line 47
    .line 48
    iget-object v1, v1, Lij3;->w:Lup3;

    .line 49
    .line 50
    invoke-static {v1}, Lij3;->j(Lsq3;)V

    .line 51
    .line 52
    .line 53
    const-string v2, "screen_view"

    .line 54
    .line 55
    invoke-virtual {v1, v2, v8, v5, v4}, Lup3;->H(Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;Z)Landroid/os/Bundle;

    .line 56
    .line 57
    .line 58
    move-result-object v16

    .line 59
    iget-wide v13, v0, Lkq2;->b:J

    .line 60
    .line 61
    const/4 v15, 0x1

    .line 62
    invoke-virtual/range {v10 .. v16}, Llm3;->J(Lbm3;Lbm3;JZLandroid/os/Bundle;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_0
    check-cast v9, Lsl3;

    .line 67
    .line 68
    move-object v4, v8

    .line 69
    check-cast v4, Ljava/lang/String;

    .line 70
    .line 71
    move-object v5, v7

    .line 72
    check-cast v5, Ljava/lang/String;

    .line 73
    .line 74
    iget-object v3, v0, Lkq2;->e:Ljava/lang/Object;

    .line 75
    .line 76
    iget-wide v1, v0, Lkq2;->b:J

    .line 77
    .line 78
    move-object v0, v9

    .line 79
    invoke-virtual/range {v0 .. v5}, Lsl3;->K(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_1
    check-cast v7, Ljava/lang/String;

    .line 84
    .line 85
    check-cast v9, Lcom/google/android/gms/measurement/internal/zzjc;

    .line 86
    .line 87
    check-cast v8, Ljava/lang/String;

    .line 88
    .line 89
    if-nez v8, :cond_1

    .line 90
    .line 91
    iget-object v0, v9, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 92
    .line 93
    invoke-virtual {v0}, Lmp3;->b()Lbj3;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v1}, Lbj3;->y()V

    .line 98
    .line 99
    .line 100
    iget-object v1, v0, Lmp3;->r0:Ljava/lang/String;

    .line 101
    .line 102
    if-eqz v1, :cond_0

    .line 103
    .line 104
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-nez v1, :cond_0

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_0
    iput-object v7, v0, Lmp3;->r0:Ljava/lang/String;

    .line 112
    .line 113
    iput-object v5, v0, Lmp3;->q0:Lbm3;

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_1
    check-cast v6, Ljava/lang/String;

    .line 117
    .line 118
    new-instance v0, Lbm3;

    .line 119
    .line 120
    invoke-direct {v0, v6, v2, v3, v8}, Lbm3;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    .line 121
    .line 122
    .line 123
    iget-object v1, v9, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 124
    .line 125
    invoke-virtual {v1}, Lmp3;->b()Lbj3;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v2}, Lbj3;->y()V

    .line 130
    .line 131
    .line 132
    iget-object v2, v1, Lmp3;->r0:Ljava/lang/String;

    .line 133
    .line 134
    if-eqz v2, :cond_2

    .line 135
    .line 136
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    :cond_2
    iput-object v7, v1, Lmp3;->r0:Ljava/lang/String;

    .line 140
    .line 141
    iput-object v0, v1, Lmp3;->q0:Lbm3;

    .line 142
    .line 143
    :goto_0
    return-void

    .line 144
    :pswitch_2
    check-cast v9, Liq2;

    .line 145
    .line 146
    check-cast v6, Landroid/os/PowerManager$WakeLock;

    .line 147
    .line 148
    const-string v1, "Failed to sync topics. Won\'t retry sync. "

    .line 149
    .line 150
    check-cast v8, Landroid/content/Context;

    .line 151
    .line 152
    invoke-static {v8}, Lkq2;->b(Landroid/content/Context;)Z

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-eqz v5, :cond_3

    .line 157
    .line 158
    const-wide/32 v10, 0x2bf20

    .line 159
    .line 160
    .line 161
    invoke-virtual {v6, v10, v11}, Landroid/os/PowerManager$WakeLock;->acquire(J)V

    .line 162
    .line 163
    .line 164
    :cond_3
    const/4 v5, 0x1

    .line 165
    :try_start_0
    invoke-virtual {v9, v5}, Liq2;->d(Z)V

    .line 166
    .line 167
    .line 168
    check-cast v7, Lsz;

    .line 169
    .line 170
    invoke-virtual {v7}, Lsz;->d()Z

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    if-nez v5, :cond_4

    .line 175
    .line 176
    invoke-virtual {v9, v4}, Liq2;->d(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    .line 178
    .line 179
    invoke-static {v8}, Lkq2;->b(Landroid/content/Context;)Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-eqz v0, :cond_7

    .line 184
    .line 185
    :goto_1
    :try_start_1
    invoke-virtual {v6}, Landroid/os/PowerManager$WakeLock;->release()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 186
    .line 187
    .line 188
    goto :goto_4

    .line 189
    :catchall_0
    move-exception v0

    .line 190
    goto :goto_5

    .line 191
    :catch_0
    move-exception v0

    .line 192
    goto :goto_3

    .line 193
    :cond_4
    :try_start_2
    invoke-static {v8}, Lkq2;->a(Landroid/content/Context;)Z

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    if-eqz v5, :cond_5

    .line 198
    .line 199
    invoke-virtual {v0}, Lkq2;->c()Z

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    if-nez v5, :cond_5

    .line 204
    .line 205
    new-instance v2, Ljq2;

    .line 206
    .line 207
    invoke-direct {v2}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 208
    .line 209
    .line 210
    iput-object v0, v2, Ljq2;->a:Lkq2;

    .line 211
    .line 212
    new-instance v0, Landroid/content/IntentFilter;

    .line 213
    .line 214
    const-string v3, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 215
    .line 216
    invoke-direct {v0, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v8, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 220
    .line 221
    .line 222
    invoke-static {v8}, Lkq2;->b(Landroid/content/Context;)Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-eqz v0, :cond_7

    .line 227
    .line 228
    goto :goto_1

    .line 229
    :cond_5
    :try_start_3
    invoke-virtual {v9}, Liq2;->e()Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-eqz v0, :cond_6

    .line 234
    .line 235
    invoke-virtual {v9, v4}, Liq2;->d(Z)V

    .line 236
    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_6
    invoke-virtual {v9, v2, v3}, Liq2;->f(J)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 240
    .line 241
    .line 242
    :goto_2
    invoke-static {v8}, Lkq2;->b(Landroid/content/Context;)Z

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    if-eqz v0, :cond_7

    .line 247
    .line 248
    goto :goto_1

    .line 249
    :goto_3
    :try_start_4
    const-string v2, "FirebaseMessaging"

    .line 250
    .line 251
    new-instance v3, Ljava/lang/StringBuilder;

    .line 252
    .line 253
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-static {v2, v0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 268
    .line 269
    .line 270
    invoke-virtual {v9, v4}, Liq2;->d(Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 271
    .line 272
    .line 273
    invoke-static {v8}, Lkq2;->b(Landroid/content/Context;)Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-eqz v0, :cond_7

    .line 278
    .line 279
    goto :goto_1

    .line 280
    :catch_1
    :cond_7
    :goto_4
    return-void

    .line 281
    :goto_5
    invoke-static {v8}, Lkq2;->b(Landroid/content/Context;)Z

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    if-eqz v1, :cond_8

    .line 286
    .line 287
    :try_start_5
    invoke-virtual {v6}, Landroid/os/PowerManager$WakeLock;->release()V
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_2

    .line 288
    .line 289
    .line 290
    :catch_2
    :cond_8
    throw v0

    .line 291
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
