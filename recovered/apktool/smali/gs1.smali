.class public final Lgs1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Ldc0;

.field public final d:Ljava/util/List;

.field public final e:Lns1;

.field public final f:Landroid/content/Context;

.field public final g:Ljava/util/HashMap;

.field public h:Z

.field public i:J

.field public j:J


# direct methods
.method public constructor <init>(Ljava/util/List;Lns1;Landroid/content/Context;)V
    .locals 3

    .line 1
    new-instance v0, Ldc0;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Ldc0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    const-wide/16 v1, 0x3e8

    .line 14
    .line 15
    iput-wide v1, p0, Lgs1;->a:J

    .line 16
    .line 17
    const-wide/16 v1, 0x2710

    .line 18
    .line 19
    iput-wide v1, p0, Lgs1;->b:J

    .line 20
    .line 21
    iput-object v0, p0, Lgs1;->c:Ldc0;

    .line 22
    .line 23
    iput-object p1, p0, Lgs1;->d:Ljava/util/List;

    .line 24
    .line 25
    iput-object p2, p0, Lgs1;->e:Lns1;

    .line 26
    .line 27
    iput-object p3, p0, Lgs1;->f:Landroid/content/Context;

    .line 28
    .line 29
    new-instance p1, Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lgs1;->g:Ljava/util/HashMap;

    .line 35
    .line 36
    return-void
.end method

.method public static a(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method


# virtual methods
.method public final b()V
    .locals 7

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Lgs1;->j:J

    .line 6
    .line 7
    sget-object v0, Lms1;->b:Lms1;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lgs1;->e(Lms1;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    sget-object v1, Lms1;->c:Lms1;

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lgs1;->e(Lms1;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    goto :goto_4

    .line 24
    :cond_0
    iget-object v2, p0, Lgs1;->c:Ldc0;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Lgs1;->f:Landroid/content/Context;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const-string v3, "connectivity"

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    instance-of v3, v2, Landroid/net/ConnectivityManager;

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    check-cast v2, Landroid/net/ConnectivityManager;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move-object v2, v4

    .line 49
    :goto_0
    if-eqz v2, :cond_2

    .line 50
    .line 51
    :try_start_0
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    goto :goto_1

    .line 56
    :catch_0
    move-exception v2

    .line 57
    goto :goto_2

    .line 58
    :cond_2
    move-object v2, v4

    .line 59
    :goto_1
    if-eqz v2, :cond_3

    .line 60
    .line 61
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 62
    .line 63
    .line 64
    move-result v3
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    if-eqz v3, :cond_3

    .line 66
    .line 67
    move-object v4, v2

    .line 68
    goto :goto_3

    .line 69
    :goto_2
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    const-string v3, "vq2"

    .line 78
    .line 79
    const-string v5, "Security exception getting NetworkInfo: %s"

    .line 80
    .line 81
    invoke-static {v3, v5, v2}, Lk50;->q(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_3
    :goto_3
    iget-object v2, p0, Lgs1;->g:Ljava/util/HashMap;

    .line 85
    .line 86
    iget-object v3, p0, Lgs1;->e:Lns1;

    .line 87
    .line 88
    if-eqz v0, :cond_4

    .line 89
    .line 90
    iget-object v0, v3, Lns1;->f:Lhs1;

    .line 91
    .line 92
    new-instance v5, Les1;

    .line 93
    .line 94
    const/4 v6, 0x0

    .line 95
    invoke-direct {v5, p0, v4, v6}, Les1;-><init>(Lgs1;Landroid/net/NetworkInfo;I)V

    .line 96
    .line 97
    .line 98
    invoke-static {v0, v5}, Lgs1;->a(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    const-string v5, "networkType"

    .line 103
    .line 104
    invoke-static {v2, v5, v0}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :cond_4
    if-eqz v1, :cond_5

    .line 108
    .line 109
    iget-object v0, v3, Lns1;->g:Lhs1;

    .line 110
    .line 111
    new-instance v1, Les1;

    .line 112
    .line 113
    const/4 v3, 0x1

    .line 114
    invoke-direct {v1, p0, v4, v3}, Les1;-><init>(Lgs1;Landroid/net/NetworkInfo;I)V

    .line 115
    .line 116
    .line 117
    invoke-static {v0, v1}, Lgs1;->a(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    const-string v0, "networkTechnology"

    .line 122
    .line 123
    invoke-static {v2, v0, p0}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_5
    :goto_4
    return-void
.end method

.method public final c()V
    .locals 12

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Lgs1;->i:J

    .line 6
    .line 7
    sget-object v0, Lms1;->v:Lms1;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lgs1;->e(Lms1;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    sget-object v1, Lms1;->i:Lms1;

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lgs1;->e(Lms1;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x1

    .line 20
    const/4 v3, 0x2

    .line 21
    iget-object v4, p0, Lgs1;->g:Ljava/util/HashMap;

    .line 22
    .line 23
    iget-object v5, p0, Lgs1;->e:Lns1;

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    if-eqz v1, :cond_9

    .line 28
    .line 29
    :cond_0
    iget-object v6, p0, Lgs1;->c:Ldc0;

    .line 30
    .line 31
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object v6, p0, Lgs1;->f:Landroid/content/Context;

    .line 35
    .line 36
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance v7, Landroid/content/IntentFilter;

    .line 40
    .line 41
    const-string v8, "android.intent.action.BATTERY_CHANGED"

    .line 42
    .line 43
    invoke-direct {v7, v8}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 v8, 0x0

    .line 47
    invoke-virtual {v6, v8, v7}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    if-nez v6, :cond_2

    .line 52
    .line 53
    :cond_1
    :goto_0
    move-object v9, v8

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const-string v7, "status"

    .line 56
    .line 57
    const/4 v9, -0x1

    .line 58
    invoke-virtual {v6, v7, v9}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    const-string v10, "level"

    .line 63
    .line 64
    invoke-virtual {v6, v10, v9}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 65
    .line 66
    .line 67
    move-result v10

    .line 68
    const-string v11, "scale"

    .line 69
    .line 70
    invoke-virtual {v6, v11, v9}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-eq v7, v9, :cond_1

    .line 75
    .line 76
    if-eq v10, v9, :cond_1

    .line 77
    .line 78
    if-ne v6, v9, :cond_3

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    if-eq v7, v2, :cond_6

    .line 82
    .line 83
    if-eq v7, v3, :cond_5

    .line 84
    .line 85
    const/4 v9, 0x5

    .line 86
    if-eq v7, v9, :cond_4

    .line 87
    .line 88
    const-string v7, "unplugged"

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    const-string v7, "full"

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_5
    const-string v7, "charging"

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_6
    move-object v7, v8

    .line 98
    :goto_1
    mul-int/lit8 v10, v10, 0x64

    .line 99
    .line 100
    int-to-float v9, v10

    .line 101
    int-to-float v6, v6

    .line 102
    div-float/2addr v9, v6

    .line 103
    float-to-int v6, v9

    .line 104
    new-instance v9, Landroid/util/Pair;

    .line 105
    .line 106
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    invoke-direct {v9, v7, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :goto_2
    if-eqz v0, :cond_7

    .line 114
    .line 115
    iget-object v0, v5, Lns1;->n:Lhs1;

    .line 116
    .line 117
    new-instance v6, Lds1;

    .line 118
    .line 119
    invoke-direct {v6, v9, v3}, Lds1;-><init>(Landroid/util/Pair;I)V

    .line 120
    .line 121
    .line 122
    invoke-static {v0, v6}, Lgs1;->a(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    const-string v6, "batteryState"

    .line 127
    .line 128
    invoke-static {v4, v6, v0}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :cond_7
    if-eqz v1, :cond_9

    .line 132
    .line 133
    iget-object v0, v5, Lns1;->m:Lis1;

    .line 134
    .line 135
    new-instance v1, Lds1;

    .line 136
    .line 137
    const/4 v6, 0x3

    .line 138
    invoke-direct {v1, v9, v6}, Lds1;-><init>(Landroid/util/Pair;I)V

    .line 139
    .line 140
    .line 141
    invoke-static {v0, v1}, Lgs1;->a(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    check-cast v0, Ljava/lang/Integer;

    .line 146
    .line 147
    if-eqz v0, :cond_8

    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-ltz v1, :cond_8

    .line 154
    .line 155
    move-object v8, v0

    .line 156
    :cond_8
    const-string v0, "batteryLevel"

    .line 157
    .line 158
    invoke-static {v4, v0, v8}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    :cond_9
    sget-object v0, Lms1;->f:Lms1;

    .line 162
    .line 163
    invoke-virtual {p0, v0}, Lgs1;->e(Lms1;)Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-eqz v0, :cond_a

    .line 168
    .line 169
    iget-object v0, v5, Lns1;->l:Lhs1;

    .line 170
    .line 171
    new-instance v1, Lfs1;

    .line 172
    .line 173
    const/4 v6, 0x0

    .line 174
    invoke-direct {v1, p0, v6}, Lfs1;-><init>(Lgs1;I)V

    .line 175
    .line 176
    .line 177
    invoke-static {v0, v1}, Lgs1;->a(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    const-string v1, "systemAvailableMemory"

    .line 182
    .line 183
    invoke-static {v4, v1, v0}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    :cond_a
    sget-object v0, Lms1;->w:Lms1;

    .line 187
    .line 188
    invoke-virtual {p0, v0}, Lgs1;->e(Lms1;)Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_b

    .line 193
    .line 194
    iget-object v0, v5, Lns1;->i:Lhs1;

    .line 195
    .line 196
    new-instance v1, Lfs1;

    .line 197
    .line 198
    invoke-direct {v1, p0, v2}, Lfs1;-><init>(Lgs1;I)V

    .line 199
    .line 200
    .line 201
    invoke-static {v0, v1}, Lgs1;->a(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    const-string v1, "availableStorage"

    .line 206
    .line 207
    invoke-static {v4, v1, v0}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    :cond_b
    sget-object v0, Lms1;->V:Lms1;

    .line 211
    .line 212
    invoke-virtual {p0, v0}, Lgs1;->e(Lms1;)Z

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-eqz v0, :cond_c

    .line 217
    .line 218
    iget-object v0, v5, Lns1;->o:Ljs1;

    .line 219
    .line 220
    new-instance v1, Lfs1;

    .line 221
    .line 222
    invoke-direct {v1, p0, v3}, Lfs1;-><init>(Lgs1;I)V

    .line 223
    .line 224
    .line 225
    invoke-static {v0, v1}, Lgs1;->a(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    const-string v0, "isPortrait"

    .line 230
    .line 231
    invoke-static {v4, v0, p0}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    :cond_c
    return-void
.end method

.method public final d()V
    .locals 14

    .line 1
    iget-object v0, p0, Lgs1;->e:Lns1;

    .line 2
    .line 3
    iget-object v1, v0, Lns1;->a:Lhs1;

    .line 4
    .line 5
    new-instance v2, Lfs1;

    .line 6
    .line 7
    const/4 v3, 0x5

    .line 8
    invoke-direct {v2, p0, v3}, Lfs1;-><init>(Lgs1;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lgs1;->a(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, p0, Lgs1;->g:Ljava/util/HashMap;

    .line 16
    .line 17
    const-string v3, "osType"

    .line 18
    .line 19
    invoke-static {v2, v3, v1}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, v0, Lns1;->b:Lhs1;

    .line 23
    .line 24
    new-instance v3, Lfs1;

    .line 25
    .line 26
    const/4 v4, 0x6

    .line 27
    invoke-direct {v3, p0, v4}, Lfs1;-><init>(Lgs1;I)V

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v3}, Lgs1;->a(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v3, "osVersion"

    .line 35
    .line 36
    invoke-static {v2, v3, v1}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object v1, v0, Lns1;->d:Lhs1;

    .line 40
    .line 41
    new-instance v3, Lfs1;

    .line 42
    .line 43
    const/4 v4, 0x7

    .line 44
    invoke-direct {v3, p0, v4}, Lfs1;-><init>(Lgs1;I)V

    .line 45
    .line 46
    .line 47
    invoke-static {v1, v3}, Lgs1;->a(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const-string v3, "deviceModel"

    .line 52
    .line 53
    invoke-static {v2, v3, v1}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object v1, v0, Lns1;->c:Lhs1;

    .line 57
    .line 58
    new-instance v3, Lfs1;

    .line 59
    .line 60
    const/16 v4, 0x8

    .line 61
    .line 62
    invoke-direct {v3, p0, v4}, Lfs1;-><init>(Lgs1;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {v1, v3}, Lgs1;->a(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    const-string v3, "deviceManufacturer"

    .line 70
    .line 71
    invoke-static {v2, v3, v1}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    sget-object v1, Lms1;->a:Lms1;

    .line 75
    .line 76
    invoke-virtual {p0, v1}, Lgs1;->e(Lms1;)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_0

    .line 81
    .line 82
    iget-object v1, v0, Lns1;->e:Lhs1;

    .line 83
    .line 84
    new-instance v3, Lfs1;

    .line 85
    .line 86
    const/16 v5, 0x9

    .line 87
    .line 88
    invoke-direct {v3, p0, v5}, Lfs1;-><init>(Lgs1;I)V

    .line 89
    .line 90
    .line 91
    invoke-static {v1, v3}, Lgs1;->a(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    const-string v3, "carrier"

    .line 96
    .line 97
    invoke-static {v2, v3, v1}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_0
    sget-object v1, Lms1;->e:Lms1;

    .line 101
    .line 102
    invoke-virtual {p0, v1}, Lgs1;->e(Lms1;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_1

    .line 107
    .line 108
    iget-object v1, v0, Lns1;->k:Lhs1;

    .line 109
    .line 110
    new-instance v3, Lfs1;

    .line 111
    .line 112
    const/16 v5, 0xa

    .line 113
    .line 114
    invoke-direct {v3, p0, v5}, Lfs1;-><init>(Lgs1;I)V

    .line 115
    .line 116
    .line 117
    invoke-static {v1, v3}, Lgs1;->a(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    const-string v3, "physicalMemory"

    .line 122
    .line 123
    invoke-static {v2, v3, v1}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_1
    sget-object v1, Lms1;->U:Lms1;

    .line 127
    .line 128
    invoke-virtual {p0, v1}, Lgs1;->e(Lms1;)Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-eqz v1, :cond_2

    .line 133
    .line 134
    iget-object v1, v0, Lns1;->j:Lhs1;

    .line 135
    .line 136
    new-instance v3, Lfs1;

    .line 137
    .line 138
    const/16 v5, 0xb

    .line 139
    .line 140
    invoke-direct {v3, p0, v5}, Lfs1;-><init>(Lgs1;I)V

    .line 141
    .line 142
    .line 143
    invoke-static {v1, v3}, Lgs1;->a(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    const-string v3, "totalStorage"

    .line 148
    .line 149
    invoke-static {v2, v3, v1}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :cond_2
    sget-object v1, Lms1;->W:Lms1;

    .line 153
    .line 154
    invoke-virtual {p0, v1}, Lgs1;->e(Lms1;)Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-eqz v1, :cond_3

    .line 159
    .line 160
    iget-object v1, v0, Lns1;->p:Lhs1;

    .line 161
    .line 162
    new-instance v3, Lfs1;

    .line 163
    .line 164
    const/16 v5, 0xc

    .line 165
    .line 166
    invoke-direct {v3, p0, v5}, Lfs1;-><init>(Lgs1;I)V

    .line 167
    .line 168
    .line 169
    invoke-static {v1, v3}, Lgs1;->a(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    const-string v3, "resolution"

    .line 174
    .line 175
    invoke-static {v2, v3, v1}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    :cond_3
    sget-object v1, Lms1;->X:Lms1;

    .line 179
    .line 180
    invoke-virtual {p0, v1}, Lgs1;->e(Lms1;)Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-eqz v1, :cond_4

    .line 185
    .line 186
    iget-object v1, v0, Lns1;->q:Lks1;

    .line 187
    .line 188
    new-instance v3, Lfs1;

    .line 189
    .line 190
    const/16 v5, 0xd

    .line 191
    .line 192
    invoke-direct {v3, p0, v5}, Lfs1;-><init>(Lgs1;I)V

    .line 193
    .line 194
    .line 195
    invoke-static {v1, v3}, Lgs1;->a(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    const-string v3, "scale"

    .line 200
    .line 201
    invoke-static {v2, v3, v1}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    :cond_4
    sget-object v1, Lms1;->Y:Lms1;

    .line 205
    .line 206
    invoke-virtual {p0, v1}, Lgs1;->e(Lms1;)Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    const/4 v3, 0x0

    .line 211
    if-eqz v1, :cond_6

    .line 212
    .line 213
    iget-object v1, v0, Lns1;->r:Lhs1;

    .line 214
    .line 215
    new-instance v5, Lfs1;

    .line 216
    .line 217
    const/4 v6, 0x3

    .line 218
    invoke-direct {v5, p0, v6}, Lfs1;-><init>(Lgs1;I)V

    .line 219
    .line 220
    .line 221
    invoke-static {v1, v5}, Lgs1;->a(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    check-cast v1, Ljava/lang/String;

    .line 226
    .line 227
    if-eqz v1, :cond_5

    .line 228
    .line 229
    invoke-static {v4, v1}, Ldi2;->y(ILjava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    goto :goto_0

    .line 234
    :cond_5
    move-object v1, v3

    .line 235
    :goto_0
    const-string v4, "language"

    .line 236
    .line 237
    invoke-static {v2, v4, v1}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    :cond_6
    sget-object v1, Lms1;->d:Lms1;

    .line 241
    .line 242
    invoke-virtual {p0, v1}, Lgs1;->e(Lms1;)Z

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    if-eqz v1, :cond_7

    .line 247
    .line 248
    iget-object v1, v0, Lns1;->h:Lhs1;

    .line 249
    .line 250
    new-instance v4, Lfs1;

    .line 251
    .line 252
    const/4 v5, 0x4

    .line 253
    invoke-direct {v4, p0, v5}, Lfs1;-><init>(Lgs1;I)V

    .line 254
    .line 255
    .line 256
    invoke-static {v1, v4}, Lgs1;->a(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    const-string v4, "androidIdfa"

    .line 261
    .line 262
    invoke-static {v2, v4, v1}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    :cond_7
    sget-object v1, Lms1;->Z:Lms1;

    .line 266
    .line 267
    invoke-virtual {p0, v1}, Lgs1;->e(Lms1;)Z

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    sget-object v4, Lms1;->a0:Lms1;

    .line 272
    .line 273
    invoke-virtual {p0, v4}, Lgs1;->e(Lms1;)Z

    .line 274
    .line 275
    .line 276
    move-result v4

    .line 277
    const/4 v5, 0x1

    .line 278
    if-nez v1, :cond_8

    .line 279
    .line 280
    if-nez v4, :cond_8

    .line 281
    .line 282
    goto/16 :goto_3

    .line 283
    .line 284
    :cond_8
    iget-object v6, v0, Lns1;->s:Lhs1;

    .line 285
    .line 286
    const-string v7, "appSetIdScope"

    .line 287
    .line 288
    const-string v8, "appSetId"

    .line 289
    .line 290
    if-eqz v6, :cond_b

    .line 291
    .line 292
    iget-object v9, v0, Lns1;->t:Lhs1;

    .line 293
    .line 294
    if-eqz v9, :cond_b

    .line 295
    .line 296
    if-eqz v1, :cond_9

    .line 297
    .line 298
    iget-object v1, v6, Lhs1;->b:Ljava/lang/String;

    .line 299
    .line 300
    invoke-static {v2, v8, v1}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    :cond_9
    if-eqz v4, :cond_14

    .line 304
    .line 305
    iget-object v0, v0, Lns1;->t:Lhs1;

    .line 306
    .line 307
    if-eqz v0, :cond_a

    .line 308
    .line 309
    iget-object v3, v0, Lhs1;->b:Ljava/lang/String;

    .line 310
    .line 311
    :cond_a
    invoke-static {v2, v7, v3}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    goto/16 :goto_3

    .line 315
    .line 316
    :cond_b
    iget-object v6, p0, Lgs1;->c:Ldc0;

    .line 317
    .line 318
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    const-string v6, "dc0"

    .line 322
    .line 323
    iget-object v9, p0, Lgs1;->f:Landroid/content/Context;

    .line 324
    .line 325
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 329
    .line 330
    .line 331
    move-result-object v10

    .line 332
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 333
    .line 334
    .line 335
    move-result-object v11

    .line 336
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move-result v10

    .line 340
    const/4 v11, 0x0

    .line 341
    if-eqz v10, :cond_c

    .line 342
    .line 343
    goto/16 :goto_2

    .line 344
    .line 345
    :cond_c
    :try_start_0
    sget v10, Ldc0;->d:I

    .line 346
    .line 347
    const-string v10, "com.google.android.gms.appset.AppSet"

    .line 348
    .line 349
    const-string v12, "getClient"

    .line 350
    .line 351
    const-class v13, Landroid/content/Context;

    .line 352
    .line 353
    filled-new-array {v13}, [Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    move-result-object v13

    .line 357
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v9

    .line 361
    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    move-result-object v10

    .line 365
    invoke-static {v9, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v9

    .line 369
    invoke-static {v13, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v13

    .line 373
    check-cast v13, [Ljava/lang/Class;

    .line 374
    .line 375
    invoke-virtual {v10, v12, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 376
    .line 377
    .line 378
    move-result-object v10

    .line 379
    array-length v12, v9

    .line 380
    invoke-static {v9, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v9

    .line 384
    invoke-virtual {v10, v3, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v9

    .line 388
    if-nez v9, :cond_d

    .line 389
    .line 390
    goto/16 :goto_2

    .line 391
    .line 392
    :cond_d
    const-string v10, "getAppSetIdInfo"

    .line 393
    .line 394
    new-array v12, v11, [Ljava/lang/Object;

    .line 395
    .line 396
    invoke-static {v9, v10, v12}, Ldc0;->b(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v9

    .line 400
    if-nez v9, :cond_e

    .line 401
    .line 402
    goto/16 :goto_2

    .line 403
    .line 404
    :cond_e
    const-string v10, "await"

    .line 405
    .line 406
    const-class v12, Lcom/google/android/gms/tasks/Task;

    .line 407
    .line 408
    filled-new-array {v12}, [Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    move-result-object v12

    .line 412
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v9

    .line 416
    const-class v13, Lcom/google/android/gms/tasks/Tasks;

    .line 417
    .line 418
    invoke-static {v9, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v9

    .line 422
    invoke-static {v12, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v12

    .line 426
    check-cast v12, [Ljava/lang/Class;

    .line 427
    .line 428
    invoke-virtual {v13, v10, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 429
    .line 430
    .line 431
    move-result-object v10

    .line 432
    array-length v12, v9

    .line 433
    invoke-static {v9, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v9

    .line 437
    invoke-virtual {v10, v3, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v9

    .line 441
    if-nez v9, :cond_f

    .line 442
    .line 443
    goto :goto_2

    .line 444
    :cond_f
    const-string v10, "getId"

    .line 445
    .line 446
    new-array v12, v11, [Ljava/lang/Object;

    .line 447
    .line 448
    invoke-static {v9, v10, v12}, Ldc0;->b(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v10

    .line 452
    if-nez v10, :cond_10

    .line 453
    .line 454
    goto :goto_2

    .line 455
    :cond_10
    const-string v12, "getScope"

    .line 456
    .line 457
    new-array v13, v11, [Ljava/lang/Object;

    .line 458
    .line 459
    invoke-static {v9, v12, v13}, Ldc0;->b(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v9

    .line 463
    if-nez v9, :cond_11

    .line 464
    .line 465
    goto :goto_2

    .line 466
    :cond_11
    new-instance v12, Landroid/util/Pair;

    .line 467
    .line 468
    check-cast v10, Ljava/lang/String;

    .line 469
    .line 470
    check-cast v9, Ljava/lang/Integer;

    .line 471
    .line 472
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 473
    .line 474
    .line 475
    move-result v9

    .line 476
    if-ne v9, v5, :cond_12

    .line 477
    .line 478
    const-string v9, "app"

    .line 479
    .line 480
    goto :goto_1

    .line 481
    :cond_12
    const-string v9, "developer"

    .line 482
    .line 483
    :goto_1
    invoke-direct {v12, v10, v9}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 484
    .line 485
    .line 486
    move-object v3, v12

    .line 487
    goto :goto_2

    .line 488
    :catch_0
    const-string v9, "AppSetID error: couldn\'t connect to Google Play Services"

    .line 489
    .line 490
    new-array v10, v11, [Ljava/lang/Object;

    .line 491
    .line 492
    invoke-static {v6, v9, v10}, Lk50;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 493
    .line 494
    .line 495
    goto :goto_2

    .line 496
    :catch_1
    const-string v9, "AppSetID error: Google Play Services not available"

    .line 497
    .line 498
    new-array v10, v11, [Ljava/lang/Object;

    .line 499
    .line 500
    invoke-static {v6, v9, v10}, Lk50;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 501
    .line 502
    .line 503
    goto :goto_2

    .line 504
    :catch_2
    const-string v9, "AppSetID error: Google Play Services not found"

    .line 505
    .line 506
    new-array v10, v11, [Ljava/lang/Object;

    .line 507
    .line 508
    invoke-static {v6, v9, v10}, Lk50;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    :goto_2
    if-eqz v1, :cond_13

    .line 512
    .line 513
    iget-object v1, v0, Lns1;->s:Lhs1;

    .line 514
    .line 515
    new-instance v6, Lds1;

    .line 516
    .line 517
    invoke-direct {v6, v3, v11}, Lds1;-><init>(Landroid/util/Pair;I)V

    .line 518
    .line 519
    .line 520
    invoke-static {v1, v6}, Lgs1;->a(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v1

    .line 524
    check-cast v1, Ljava/lang/String;

    .line 525
    .line 526
    invoke-static {v2, v8, v1}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    :cond_13
    if-eqz v4, :cond_14

    .line 530
    .line 531
    iget-object v0, v0, Lns1;->t:Lhs1;

    .line 532
    .line 533
    new-instance v1, Lds1;

    .line 534
    .line 535
    invoke-direct {v1, v3, v5}, Lds1;-><init>(Landroid/util/Pair;I)V

    .line 536
    .line 537
    .line 538
    invoke-static {v0, v1}, Lgs1;->a(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    check-cast v0, Ljava/lang/String;

    .line 543
    .line 544
    invoke-static {v2, v7, v0}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 545
    .line 546
    .line 547
    :cond_14
    :goto_3
    iput-boolean v5, p0, Lgs1;->h:Z

    .line 548
    .line 549
    return-void
.end method

.method public final e(Lms1;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lgs1;->d:Ljava/util/List;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x1

    .line 11
    return p0
.end method
