.class public final Lth0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Law;


# instance fields
.field public final a:Ljava/io/File;

.field public final b:Lqe2;

.field public final c:Lc8;

.field public final d:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final e:Lgl1;


# direct methods
.method public constructor <init>(Ljava/io/File;Lqe2;Lc8;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lth0;->a:Ljava/io/File;

    .line 8
    .line 9
    iput-object p2, p0, Lth0;->b:Lqe2;

    .line 10
    .line 11
    iput-object p3, p0, Lth0;->c:Lc8;

    .line 12
    .line 13
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lth0;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 20
    .line 21
    new-instance p1, Lgl1;

    .line 22
    .line 23
    invoke-direct {p1}, Lgl1;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lth0;->e:Lgl1;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a(Lo40;Ld10;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lrh0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lrh0;

    .line 7
    .line 8
    iget v1, v0, Lrh0;->f:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lrh0;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lrh0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lrh0;-><init>(Lth0;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lrh0;->d:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lrh0;->f:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-boolean p0, v0, Lrh0;->c:Z

    .line 38
    .line 39
    iget-object p1, v0, Lrh0;->b:Lph0;

    .line 40
    .line 41
    iget-object v0, v0, Lrh0;->a:Lth0;

    .line 42
    .line 43
    :try_start_0
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :catchall_0
    move-exception p2

    .line 48
    move-object v6, p2

    .line 49
    move p2, p0

    .line 50
    move-object p0, v0

    .line 51
    move-object v0, v6

    .line 52
    goto :goto_3

    .line 53
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v4

    .line 59
    :cond_2
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p2, p0, Lth0;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 63
    .line 64
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    if-nez p2, :cond_7

    .line 69
    .line 70
    iget-object p2, p0, Lth0;->e:Lgl1;

    .line 71
    .line 72
    invoke-virtual {p2}, Lgl1;->e()Z

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    :try_start_1
    new-instance v2, Lph0;

    .line 77
    .line 78
    iget-object v5, p0, Lth0;->a:Ljava/io/File;

    .line 79
    .line 80
    invoke-direct {v2, v5}, Lph0;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 81
    .line 82
    .line 83
    :try_start_2
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    iput-object p0, v0, Lrh0;->a:Lth0;

    .line 88
    .line 89
    iput-object v2, v0, Lrh0;->b:Lph0;

    .line 90
    .line 91
    iput-boolean p2, v0, Lrh0;->c:Z

    .line 92
    .line 93
    iput v3, v0, Lrh0;->f:I

    .line 94
    .line 95
    invoke-virtual {p1, v2, v5, v0}, Lo40;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 99
    if-ne p1, v1, :cond_3

    .line 100
    .line 101
    return-object v1

    .line 102
    :cond_3
    move-object v0, p0

    .line 103
    move p0, p2

    .line 104
    move-object p2, p1

    .line 105
    move-object p1, v2

    .line 106
    :goto_1
    :try_start_3
    invoke-interface {p1}, Law;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 107
    .line 108
    .line 109
    move-object p1, v4

    .line 110
    goto :goto_2

    .line 111
    :catchall_1
    move-exception p1

    .line 112
    :goto_2
    if-nez p1, :cond_5

    .line 113
    .line 114
    if-eqz p0, :cond_4

    .line 115
    .line 116
    iget-object p0, v0, Lth0;->e:Lgl1;

    .line 117
    .line 118
    invoke-virtual {p0, v4}, Lgl1;->g(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_4
    return-object p2

    .line 122
    :cond_5
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 123
    :catchall_2
    move-exception p1

    .line 124
    move p2, p0

    .line 125
    move-object p0, v0

    .line 126
    goto :goto_5

    .line 127
    :catchall_3
    move-exception p1

    .line 128
    move-object v0, p1

    .line 129
    move-object p1, v2

    .line 130
    :goto_3
    :try_start_5
    invoke-interface {p1}, Law;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 131
    .line 132
    .line 133
    goto :goto_4

    .line 134
    :catchall_4
    move-exception p1

    .line 135
    :try_start_6
    invoke-static {v0, p1}, Ljf0;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 136
    .line 137
    .line 138
    :goto_4
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 139
    :catchall_5
    move-exception p1

    .line 140
    :goto_5
    if-eqz p2, :cond_6

    .line 141
    .line 142
    iget-object p0, p0, Lth0;->e:Lgl1;

    .line 143
    .line 144
    invoke-virtual {p0, v4}, Lgl1;->g(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    :cond_6
    throw p1

    .line 148
    :cond_7
    const-string p0, "StorageConnection has already been disposed."

    .line 149
    .line 150
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    return-object v4
.end method

.method public final b(La50;Ld10;)Ljava/lang/Object;
    .locals 8

    .line 1
    const-string v0, "Unable to rename "

    .line 2
    .line 3
    instance-of v1, p2, Lsh0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p2

    .line 8
    check-cast v1, Lsh0;

    .line 9
    .line 10
    iget v2, v1, Lsh0;->i:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lsh0;->i:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lsh0;

    .line 23
    .line 24
    invoke-direct {v1, p0, p2}, Lsh0;-><init>(Lth0;Ld10;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p2, v1, Lsh0;->e:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lz10;->a:Lz10;

    .line 30
    .line 31
    iget v3, v1, Lsh0;->i:I

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x1

    .line 35
    const/4 v6, 0x0

    .line 36
    if-eqz v3, :cond_3

    .line 37
    .line 38
    if-eq v3, v5, :cond_2

    .line 39
    .line 40
    if-ne v3, v4, :cond_1

    .line 41
    .line 42
    iget-object p0, v1, Lsh0;->d:Lei0;

    .line 43
    .line 44
    iget-object p1, v1, Lsh0;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Ljava/io/File;

    .line 47
    .line 48
    iget-object v2, v1, Lsh0;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Ldl1;

    .line 51
    .line 52
    iget-object v1, v1, Lsh0;->a:Lth0;

    .line 53
    .line 54
    :try_start_0
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    goto/16 :goto_4

    .line 58
    .line 59
    :catchall_0
    move-exception p2

    .line 60
    goto/16 :goto_8

    .line 61
    .line 62
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v6

    .line 68
    :cond_2
    iget-object p0, v1, Lsh0;->c:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p0, Ldl1;

    .line 71
    .line 72
    iget-object p1, v1, Lsh0;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p1, Lkotlin/jvm/functions/Function2;

    .line 75
    .line 76
    iget-object v3, v1, Lsh0;->a:Lth0;

    .line 77
    .line 78
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    move-object p2, p0

    .line 82
    move-object p0, v3

    .line 83
    goto :goto_2

    .line 84
    :cond_3
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object p2, p0, Lth0;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 88
    .line 89
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    if-nez p2, :cond_d

    .line 94
    .line 95
    iget-object p2, p0, Lth0;->a:Ljava/io/File;

    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    if-eqz v3, :cond_5

    .line 106
    .line 107
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-eqz v3, :cond_4

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_4
    new-instance p0, Ljava/io/IOException;

    .line 118
    .line 119
    new-instance p1, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    const-string v0, "Unable to create parent directories of "

    .line 122
    .line 123
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw p0

    .line 137
    :cond_5
    :goto_1
    iput-object p0, v1, Lsh0;->a:Lth0;

    .line 138
    .line 139
    iput-object p1, v1, Lsh0;->b:Ljava/lang/Object;

    .line 140
    .line 141
    iget-object p2, p0, Lth0;->e:Lgl1;

    .line 142
    .line 143
    iput-object p2, v1, Lsh0;->c:Ljava/lang/Object;

    .line 144
    .line 145
    iput v5, v1, Lsh0;->i:I

    .line 146
    .line 147
    invoke-virtual {p2, v1}, Lgl1;->d(Ld10;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    if-ne v3, v2, :cond_6

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_6
    :goto_2
    :try_start_1
    new-instance v3, Ljava/io/File;

    .line 155
    .line 156
    new-instance v5, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 159
    .line 160
    .line 161
    iget-object v7, p0, Lth0;->a:Ljava/io/File;

    .line 162
    .line 163
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const-string v7, ".tmp"

    .line 171
    .line 172
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    invoke-direct {v3, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 180
    .line 181
    .line 182
    :try_start_2
    new-instance v5, Lei0;

    .line 183
    .line 184
    invoke-direct {v5, v3}, Lph0;-><init>(Ljava/io/File;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 185
    .line 186
    .line 187
    :try_start_3
    iput-object p0, v1, Lsh0;->a:Lth0;

    .line 188
    .line 189
    iput-object p2, v1, Lsh0;->b:Ljava/lang/Object;

    .line 190
    .line 191
    iput-object v3, v1, Lsh0;->c:Ljava/lang/Object;

    .line 192
    .line 193
    iput-object v5, v1, Lsh0;->d:Lei0;

    .line 194
    .line 195
    iput v4, v1, Lsh0;->i:I

    .line 196
    .line 197
    invoke-interface {p1, v5, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 201
    if-ne p1, v2, :cond_7

    .line 202
    .line 203
    :goto_3
    return-object v2

    .line 204
    :cond_7
    move-object v1, p0

    .line 205
    move-object v2, p2

    .line 206
    move-object p1, v3

    .line 207
    move-object p0, v5

    .line 208
    :goto_4
    :try_start_4
    invoke-interface {p0}, Law;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 209
    .line 210
    .line 211
    move-object p0, v6

    .line 212
    goto :goto_5

    .line 213
    :catchall_1
    move-exception p0

    .line 214
    :goto_5
    if-nez p0, :cond_b

    .line 215
    .line 216
    :try_start_5
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 217
    .line 218
    .line 219
    move-result p0

    .line 220
    if-eqz p0, :cond_a

    .line 221
    .line 222
    iget-object p0, v1, Lth0;->a:Ljava/io/File;

    .line 223
    .line 224
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 225
    .line 226
    const/16 v3, 0x1a

    .line 227
    .line 228
    if-lt p2, v3, :cond_8

    .line 229
    .line 230
    invoke-static {p1, p0}, Lf9;->a(Ljava/io/File;Ljava/io/File;)Z

    .line 231
    .line 232
    .line 233
    move-result p0

    .line 234
    goto :goto_6

    .line 235
    :cond_8
    invoke-virtual {p1, p0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 236
    .line 237
    .line 238
    move-result p0

    .line 239
    :goto_6
    if-eqz p0, :cond_9

    .line 240
    .line 241
    goto :goto_7

    .line 242
    :cond_9
    new-instance p0, Ljava/io/IOException;

    .line 243
    .line 244
    new-instance p2, Ljava/lang/StringBuilder;

    .line 245
    .line 246
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    const-string v0, " to "

    .line 253
    .line 254
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    iget-object v0, v1, Lth0;->a:Ljava/io/File;

    .line 258
    .line 259
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    const-string v0, ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."

    .line 263
    .line 264
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object p2

    .line 271
    invoke-direct {p0, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    throw p0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 275
    :catchall_2
    move-exception p0

    .line 276
    move-object p2, v2

    .line 277
    goto :goto_b

    .line 278
    :catch_0
    move-exception p0

    .line 279
    move-object v3, p1

    .line 280
    move-object p2, v2

    .line 281
    goto :goto_a

    .line 282
    :cond_a
    :goto_7
    check-cast v2, Lgl1;

    .line 283
    .line 284
    invoke-virtual {v2, v6}, Lgl1;->g(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 288
    .line 289
    return-object p0

    .line 290
    :cond_b
    :try_start_6
    throw p0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 291
    :catchall_3
    move-exception p0

    .line 292
    move-object v2, p2

    .line 293
    move-object p1, v3

    .line 294
    move-object p2, p0

    .line 295
    move-object p0, v5

    .line 296
    :goto_8
    :try_start_7
    invoke-interface {p0}, Law;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 297
    .line 298
    .line 299
    goto :goto_9

    .line 300
    :catchall_4
    move-exception p0

    .line 301
    :try_start_8
    invoke-static {p2, p0}, Ljf0;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 302
    .line 303
    .line 304
    :goto_9
    throw p2
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 305
    :catchall_5
    move-exception p0

    .line 306
    goto :goto_b

    .line 307
    :catch_1
    move-exception p0

    .line 308
    :goto_a
    :try_start_9
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 309
    .line 310
    .line 311
    move-result p1

    .line 312
    if-eqz p1, :cond_c

    .line 313
    .line 314
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 315
    .line 316
    .line 317
    :cond_c
    throw p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 318
    :goto_b
    check-cast p2, Lgl1;

    .line 319
    .line 320
    invoke-virtual {p2, v6}, Lgl1;->g(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    throw p0

    .line 324
    :cond_d
    const-string p0, "StorageConnection has already been disposed."

    .line 325
    .line 326
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    return-object v6
.end method

.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, Lth0;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lth0;->c:Lc8;

    .line 8
    .line 9
    invoke-virtual {p0}, Lc8;->invoke()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void
.end method
