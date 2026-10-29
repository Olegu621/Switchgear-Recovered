.class public final Lln;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lkn;

.field public final c:Lgf;

.field public final d:Llq;

.field public final e:Lcq;

.field public final f:Ljava/util/ArrayList;

.field public final g:Lc90;

.field public final h:J

.field public final i:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lgf;Ljq;J)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lln;->i:Ljava/util/HashMap;

    .line 10
    .line 11
    iput-object p1, p0, Lln;->a:Landroid/content/Context;

    .line 12
    .line 13
    iput-object p2, p0, Lln;->c:Lgf;

    .line 14
    .line 15
    iget-object p2, p2, Lgf;->b:Landroid/os/Handler;

    .line 16
    .line 17
    invoke-static {p1, p2}, Lcq;->a(Landroid/content/Context;Landroid/os/Handler;)Lcq;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    iput-object p2, p0, Lln;->e:Lcq;

    .line 22
    .line 23
    invoke-static {p1}, Lc90;->b(Landroid/content/Context;)Lc90;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lln;->g:Lc90;

    .line 28
    .line 29
    :try_start_0
    new-instance p1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    iget-object v0, p2, Lcq;->a:Lcb;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Llo; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lmq; {:try_start_0 .. :try_end_0} :catch_2

    .line 37
    .line 38
    .line 39
    :try_start_1
    iget-object v0, v0, Lcb;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Landroid/hardware/camera2/CameraManager;

    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/hardware/camera2/CameraManager;->getCameraIdList()[Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0
    :try_end_1
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Llo; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lmq; {:try_start_1 .. :try_end_1} :catch_2

    .line 47
    :try_start_2
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-nez p3, :cond_0

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result p3

    .line 61
    if-eqz p3, :cond_3

    .line 62
    .line 63
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    check-cast p3, Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Llo; {:try_start_2 .. :try_end_2} :catch_3
    .catch Lmq; {:try_start_2 .. :try_end_2} :catch_2

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    :try_start_3
    invoke-virtual {p3}, Ljq;->b()Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-static {p2, v1, v0}, Lhe3;->d(Lcq;Ljava/lang/Integer;Ljava/util/List;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p2
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Llo; {:try_start_3 .. :try_end_3} :catch_3
    .catch Lmq; {:try_start_3 .. :try_end_3} :catch_2

    .line 81
    goto :goto_1

    .line 82
    :catch_0
    const/4 p2, 0x0

    .line 83
    :goto_1
    :try_start_4
    new-instance v1, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_2

    .line 97
    .line 98
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    check-cast v2, Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-eqz v3, :cond_1

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_1
    invoke-virtual {p0, v2}, Lln;->b(Ljava/lang/String;)Lzn;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_2
    invoke-virtual {p3, v1}, Ljq;->a(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result p3

    .line 131
    if-eqz p3, :cond_3

    .line 132
    .line 133
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p3

    .line 137
    check-cast p3, Lxp;

    .line 138
    .line 139
    check-cast p3, Lxp;

    .line 140
    .line 141
    invoke-interface {p3}, Lxp;->b()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p3

    .line 145
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Llo; {:try_start_4 .. :try_end_4} :catch_3
    .catch Lmq; {:try_start_4 .. :try_end_4} :catch_2

    .line 146
    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_3
    new-instance p2, Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result p3

    .line 162
    if-eqz p3, :cond_7

    .line 163
    .line 164
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p3

    .line 168
    check-cast p3, Ljava/lang/String;

    .line 169
    .line 170
    const-string v0, "0"

    .line 171
    .line 172
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-nez v0, :cond_6

    .line 177
    .line 178
    const-string v0, "1"

    .line 179
    .line 180
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eqz v0, :cond_4

    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_4
    iget-object v0, p0, Lln;->e:Lcq;

    .line 188
    .line 189
    invoke-static {v0, p3}, Lyy1;->w(Lcq;Ljava/lang/String;)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-eqz v0, :cond_5

    .line 194
    .line 195
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_5
    const-string p3, "Camera2CameraFactory"

    .line 200
    .line 201
    invoke-static {p3}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_6
    :goto_5
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_7
    iput-object p2, p0, Lln;->f:Ljava/util/ArrayList;

    .line 210
    .line 211
    new-instance p1, Lkn;

    .line 212
    .line 213
    iget-object p2, p0, Lln;->e:Lcq;

    .line 214
    .line 215
    invoke-direct {p1, p2}, Lkn;-><init>(Lcq;)V

    .line 216
    .line 217
    .line 218
    iput-object p1, p0, Lln;->b:Lkn;

    .line 219
    .line 220
    new-instance p2, Llq;

    .line 221
    .line 222
    invoke-direct {p2, p1}, Llq;-><init>(Lkn;)V

    .line 223
    .line 224
    .line 225
    iput-object p2, p0, Lln;->d:Llq;

    .line 226
    .line 227
    iget-object p1, p1, Lkn;->d:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast p1, Ljava/util/ArrayList;

    .line 230
    .line 231
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    iput-wide p4, p0, Lln;->h:J

    .line 235
    .line 236
    return-void

    .line 237
    :catch_1
    move-exception p0

    .line 238
    :try_start_5
    new-instance p1, Llo;

    .line 239
    .line 240
    invoke-direct {p1, p0}, Llo;-><init>(Landroid/hardware/camera2/CameraAccessException;)V

    .line 241
    .line 242
    .line 243
    throw p1
    :try_end_5
    .catch Llo; {:try_start_5 .. :try_end_5} :catch_3
    .catch Lmq; {:try_start_5 .. :try_end_5} :catch_2

    .line 244
    :catch_2
    move-exception p0

    .line 245
    new-instance p1, Lux0;

    .line 246
    .line 247
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 248
    .line 249
    .line 250
    throw p1

    .line 251
    :catch_3
    move-exception p0

    .line 252
    new-instance p1, Lux0;

    .line 253
    .line 254
    new-instance p2, Lmq;

    .line 255
    .line 256
    invoke-direct {p2, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 257
    .line 258
    .line 259
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 260
    .line 261
    .line 262
    throw p1
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lxn;
    .locals 13

    .line 1
    iget-object v0, p0, Lln;->f:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Lxn;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lln;->b(Ljava/lang/String;)Lzn;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    iget-object v0, p0, Lln;->c:Lgf;

    .line 16
    .line 17
    iget-object v8, v0, Lgf;->a:Ljava/util/concurrent/Executor;

    .line 18
    .line 19
    iget-object v9, v0, Lgf;->b:Landroid/os/Handler;

    .line 20
    .line 21
    iget-object v10, p0, Lln;->g:Lc90;

    .line 22
    .line 23
    iget-wide v11, p0, Lln;->h:J

    .line 24
    .line 25
    iget-object v2, p0, Lln;->a:Landroid/content/Context;

    .line 26
    .line 27
    iget-object v3, p0, Lln;->e:Lcq;

    .line 28
    .line 29
    iget-object v6, p0, Lln;->b:Lkn;

    .line 30
    .line 31
    iget-object v7, p0, Lln;->d:Llq;

    .line 32
    .line 33
    move-object v4, p1

    .line 34
    invoke-direct/range {v1 .. v12}, Lxn;-><init>(Landroid/content/Context;Lcq;Ljava/lang/String;Lzn;Lkn;Llq;Ljava/util/concurrent/Executor;Landroid/os/Handler;Lc90;J)V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_0
    const-string p0, "The given camera id is not on the available camera id list."

    .line 39
    .line 40
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    return-object p0
.end method

.method public final b(Ljava/lang/String;)Lzn;
    .locals 2

    .line 1
    iget-object v0, p0, Lln;->i:Ljava/util/HashMap;

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lzn;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Lzn;

    .line 12
    .line 13
    iget-object p0, p0, Lln;->e:Lcq;

    .line 14
    .line 15
    invoke-direct {v1, p0, p1}, Lzn;-><init>(Lcq;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Llo; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    :cond_0
    return-object v1

    .line 22
    :catch_0
    move-exception p0

    .line 23
    new-instance p1, Lmq;

    .line 24
    .line 25
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    throw p1
.end method
