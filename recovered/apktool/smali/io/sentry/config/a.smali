.class public abstract Lio/sentry/config/a;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, "10"

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Ljava/math/BigInteger;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/16 v0, 0x10

    .line 10
    .line 11
    invoke-direct {v1, p0, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/math/BigInteger;->toByteArray()[B

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 23
    .line 24
    .line 25
    const-string v0, "%08x-%04x-%04x-%04x-%04x%08x"

    .line 26
    .line 27
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getShort()S

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getShort()S

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 58
    .line 59
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getShort()S

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getShort()S

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    filled-new-array/range {v2 .. v7}, [Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/nio/BufferUnderflowException; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    return-object p0

    .line 96
    :catch_0
    const/4 p0, 0x0

    .line 97
    return-object p0
.end method

.method public static b(Ljava/io/File;Ljava/io/FileInputStream;)Ljava/io/FileInputStream;
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lio/sentry/c1;->l()Lio/sentry/m6;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lio/sentry/m6;->isTracingEnabled()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lio/sentry/instrumentation/file/e;

    .line 16
    .line 17
    invoke-static {p0, p1}, Lio/sentry/instrumentation/file/e;->c(Ljava/io/File;Ljava/io/FileInputStream;)Lio/sentry/instrumentation/file/c;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {v0, p0}, Lio/sentry/instrumentation/file/e;-><init>(Lio/sentry/instrumentation/file/c;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    return-object p1
.end method

.method public static c(Ljava/io/FileInputStream;Ljava/io/FileDescriptor;)Ljava/io/FileInputStream;
    .locals 5

    .line 1
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lio/sentry/c1;->l()Lio/sentry/m6;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lio/sentry/m6;->isTracingEnabled()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    new-instance v0, Lio/sentry/instrumentation/file/e;

    .line 16
    .line 17
    sget-boolean v1, Lio/sentry/util/k;->a:Z

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {v1}, Lio/sentry/c1;->m()Lio/sentry/m1;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, Lio/sentry/c1;->g()Lio/sentry/k1;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :goto_0
    const/4 v2, 0x0

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    const-string v3, "file.read"

    .line 42
    .line 43
    invoke-interface {v1, v3}, Lio/sentry/k1;->p(Ljava/lang/String;)Lio/sentry/k1;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move-object v1, v2

    .line 49
    :goto_1
    new-instance v3, Lio/sentry/instrumentation/file/c;

    .line 50
    .line 51
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-interface {v4}, Lio/sentry/c1;->l()Lio/sentry/m6;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-direct {v3, v2, v1, p0, v4}, Lio/sentry/instrumentation/file/c;-><init>(Ljava/io/File;Lio/sentry/k1;Ljava/io/Closeable;Lio/sentry/m6;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {v0, v3, p1}, Lio/sentry/instrumentation/file/e;-><init>(Lio/sentry/instrumentation/file/c;Ljava/io/FileDescriptor;)V

    .line 63
    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_2
    return-object p0
.end method

.method public static d(Ljava/io/File;Ljava/io/FileOutputStream;Z)Ljava/io/FileOutputStream;
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lio/sentry/c1;->l()Lio/sentry/m6;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lio/sentry/m6;->isTracingEnabled()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lio/sentry/instrumentation/file/g;

    .line 16
    .line 17
    invoke-static {p0, p1, p2}, Lio/sentry/instrumentation/file/g;->c(Ljava/io/File;Ljava/io/FileOutputStream;Z)Lio/sentry/instrumentation/file/c;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {v0, p0}, Lio/sentry/instrumentation/file/g;-><init>(Lio/sentry/instrumentation/file/c;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    return-object p1
.end method

.method public static e(Ljava/io/FileOutputStream;Ljava/io/File;)Ljava/io/FileOutputStream;
    .locals 2

    .line 1
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lio/sentry/c1;->l()Lio/sentry/m6;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lio/sentry/m6;->isTracingEnabled()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lio/sentry/instrumentation/file/g;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-static {p1, p0, v1}, Lio/sentry/instrumentation/file/g;->c(Ljava/io/File;Ljava/io/FileOutputStream;Z)Lio/sentry/instrumentation/file/c;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-direct {v0, p0}, Lio/sentry/instrumentation/file/g;-><init>(Lio/sentry/instrumentation/file/c;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    return-object p0
.end method

.method public static f(Lio/sentry/q4;Ljava/lang/String;Lio/sentry/i3;Lio/sentry/ILogger;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x8

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, -0x1

    .line 11
    sparse-switch v0, :sswitch_data_0

    .line 12
    .line 13
    .line 14
    goto/16 :goto_0

    .line 15
    .line 16
    :sswitch_0
    const-string v0, "platform"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    :cond_0
    const/16 v5, 0xd

    .line 27
    .line 28
    goto/16 :goto_0

    .line 29
    .line 30
    :sswitch_1
    const-string v0, "request"

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-nez p1, :cond_1

    .line 37
    .line 38
    goto/16 :goto_0

    .line 39
    .line 40
    :cond_1
    const/16 v5, 0xc

    .line 41
    .line 42
    goto/16 :goto_0

    .line 43
    .line 44
    :sswitch_2
    const-string v0, "release"

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_2

    .line 51
    .line 52
    goto/16 :goto_0

    .line 53
    .line 54
    :cond_2
    const/16 v5, 0xb

    .line 55
    .line 56
    goto/16 :goto_0

    .line 57
    .line 58
    :sswitch_3
    const-string v0, "event_id"

    .line 59
    .line 60
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-nez p1, :cond_3

    .line 65
    .line 66
    goto/16 :goto_0

    .line 67
    .line 68
    :cond_3
    const/16 v5, 0xa

    .line 69
    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :sswitch_4
    const-string v0, "extra"

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-nez p1, :cond_4

    .line 79
    .line 80
    goto/16 :goto_0

    .line 81
    .line 82
    :cond_4
    const/16 v5, 0x9

    .line 83
    .line 84
    goto/16 :goto_0

    .line 85
    .line 86
    :sswitch_5
    const-string v0, "user"

    .line 87
    .line 88
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-nez p1, :cond_5

    .line 93
    .line 94
    goto/16 :goto_0

    .line 95
    .line 96
    :cond_5
    move v5, v1

    .line 97
    goto/16 :goto_0

    .line 98
    .line 99
    :sswitch_6
    const-string v0, "tags"

    .line 100
    .line 101
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-nez p1, :cond_6

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_6
    const/4 v5, 0x7

    .line 109
    goto :goto_0

    .line 110
    :sswitch_7
    const-string v0, "dist"

    .line 111
    .line 112
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-nez p1, :cond_7

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_7
    const/4 v5, 0x6

    .line 120
    goto :goto_0

    .line 121
    :sswitch_8
    const-string v0, "sdk"

    .line 122
    .line 123
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-nez p1, :cond_8

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_8
    const/4 v5, 0x5

    .line 131
    goto :goto_0

    .line 132
    :sswitch_9
    const-string v0, "breadcrumbs"

    .line 133
    .line 134
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-nez p1, :cond_9

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_9
    const/4 v5, 0x4

    .line 142
    goto :goto_0

    .line 143
    :sswitch_a
    const-string v0, "environment"

    .line 144
    .line 145
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    if-nez p1, :cond_a

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_a
    const/4 v5, 0x3

    .line 153
    goto :goto_0

    .line 154
    :sswitch_b
    const-string v0, "contexts"

    .line 155
    .line 156
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    if-nez p1, :cond_b

    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_b
    move v5, v2

    .line 164
    goto :goto_0

    .line 165
    :sswitch_c
    const-string v0, "server_name"

    .line 166
    .line 167
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    if-nez p1, :cond_c

    .line 172
    .line 173
    goto :goto_0

    .line 174
    :cond_c
    move v5, v4

    .line 175
    goto :goto_0

    .line 176
    :sswitch_d
    const-string v0, "debug_meta"

    .line 177
    .line 178
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    if-nez p1, :cond_d

    .line 183
    .line 184
    goto :goto_0

    .line 185
    :cond_d
    move v5, v3

    .line 186
    :goto_0
    packed-switch v5, :pswitch_data_0

    .line 187
    .line 188
    .line 189
    return v3

    .line 190
    :pswitch_0
    invoke-interface {p2}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    iput-object p1, p0, Lio/sentry/q4;->v:Ljava/lang/String;

    .line 195
    .line 196
    return v4

    .line 197
    :pswitch_1
    new-instance p1, Lio/sentry/clientreport/a;

    .line 198
    .line 199
    const/16 v0, 0x13

    .line 200
    .line 201
    invoke-direct {p1, v0}, Lio/sentry/clientreport/a;-><init>(I)V

    .line 202
    .line 203
    .line 204
    invoke-interface {p2, p3, p1}, Lio/sentry/i3;->K0(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    check-cast p1, Lio/sentry/protocol/r;

    .line 209
    .line 210
    iput-object p1, p0, Lio/sentry/q4;->d:Lio/sentry/protocol/r;

    .line 211
    .line 212
    return v4

    .line 213
    :pswitch_2
    invoke-interface {p2}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    iput-object p1, p0, Lio/sentry/q4;->f:Ljava/lang/String;

    .line 218
    .line 219
    return v4

    .line 220
    :pswitch_3
    new-instance p1, Lio/sentry/clientreport/a;

    .line 221
    .line 222
    const/16 v0, 0x17

    .line 223
    .line 224
    invoke-direct {p1, v0}, Lio/sentry/clientreport/a;-><init>(I)V

    .line 225
    .line 226
    .line 227
    invoke-interface {p2, p3, p1}, Lio/sentry/i3;->K0(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    check-cast p1, Lio/sentry/protocol/w;

    .line 232
    .line 233
    iput-object p1, p0, Lio/sentry/q4;->a:Lio/sentry/protocol/w;

    .line 234
    .line 235
    return v4

    .line 236
    :pswitch_4
    invoke-interface {p2}, Lio/sentry/i3;->R0()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    check-cast p1, Ljava/util/Map;

    .line 241
    .line 242
    invoke-static {p1}, Lio/sentry/util/c;->n(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    iput-object p1, p0, Lio/sentry/q4;->Z:Ljava/util/AbstractMap;

    .line 247
    .line 248
    return v4

    .line 249
    :pswitch_5
    new-instance p1, Lio/sentry/protocol/d0;

    .line 250
    .line 251
    invoke-direct {p1, v2}, Lio/sentry/protocol/d0;-><init>(I)V

    .line 252
    .line 253
    .line 254
    invoke-interface {p2, p3, p1}, Lio/sentry/i3;->K0(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    check-cast p1, Lio/sentry/protocol/j0;

    .line 259
    .line 260
    iput-object p1, p0, Lio/sentry/q4;->w:Lio/sentry/protocol/j0;

    .line 261
    .line 262
    return v4

    .line 263
    :pswitch_6
    invoke-interface {p2}, Lio/sentry/i3;->R0()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    check-cast p1, Ljava/util/Map;

    .line 268
    .line 269
    invoke-static {p1}, Lio/sentry/util/c;->n(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    iput-object p1, p0, Lio/sentry/q4;->e:Ljava/util/AbstractMap;

    .line 274
    .line 275
    return v4

    .line 276
    :pswitch_7
    invoke-interface {p2}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    iput-object p1, p0, Lio/sentry/q4;->W:Ljava/lang/String;

    .line 281
    .line 282
    return v4

    .line 283
    :pswitch_8
    new-instance p1, Lio/sentry/clientreport/a;

    .line 284
    .line 285
    const/16 v0, 0x15

    .line 286
    .line 287
    invoke-direct {p1, v0}, Lio/sentry/clientreport/a;-><init>(I)V

    .line 288
    .line 289
    .line 290
    invoke-interface {p2, p3, p1}, Lio/sentry/i3;->K0(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    check-cast p1, Lio/sentry/protocol/u;

    .line 295
    .line 296
    iput-object p1, p0, Lio/sentry/q4;->c:Lio/sentry/protocol/u;

    .line 297
    .line 298
    return v4

    .line 299
    :pswitch_9
    new-instance p1, Lio/sentry/e;

    .line 300
    .line 301
    invoke-direct {p1, v3}, Lio/sentry/e;-><init>(I)V

    .line 302
    .line 303
    .line 304
    invoke-interface {p2, p3, p1}, Lio/sentry/i3;->h1(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/util/ArrayList;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    iput-object p1, p0, Lio/sentry/q4;->X:Ljava/util/List;

    .line 309
    .line 310
    return v4

    .line 311
    :pswitch_a
    invoke-interface {p2}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    iput-object p1, p0, Lio/sentry/q4;->i:Ljava/lang/String;

    .line 316
    .line 317
    return v4

    .line 318
    :pswitch_b
    invoke-static {p2, p3}, Lio/sentry/clientreport/a;->c(Lio/sentry/i3;Lio/sentry/ILogger;)Lio/sentry/protocol/e;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    iget-object p0, p0, Lio/sentry/q4;->b:Lio/sentry/protocol/e;

    .line 323
    .line 324
    invoke-virtual {p0, p1}, Lio/sentry/protocol/e;->l(Lio/sentry/protocol/e;)V

    .line 325
    .line 326
    .line 327
    return v4

    .line 328
    :pswitch_c
    invoke-interface {p2}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    iput-object p1, p0, Lio/sentry/q4;->V:Ljava/lang/String;

    .line 333
    .line 334
    return v4

    .line 335
    :pswitch_d
    new-instance p1, Lio/sentry/clientreport/a;

    .line 336
    .line 337
    invoke-direct {p1, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    .line 338
    .line 339
    .line 340
    invoke-interface {p2, p3, p1}, Lio/sentry/i3;->K0(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    check-cast p1, Lio/sentry/protocol/f;

    .line 345
    .line 346
    iput-object p1, p0, Lio/sentry/q4;->Y:Lio/sentry/protocol/f;

    .line 347
    .line 348
    return v4

    .line 349
    :sswitch_data_0
    .sparse-switch
        -0x6db2cb8f -> :sswitch_d
        -0x2d39e9f9 -> :sswitch_c
        -0x21d07f5c -> :sswitch_b
        -0x51ecded -> :sswitch_a
        -0x3112f30 -> :sswitch_9
        0x1bc3a -> :sswitch_8
        0x2f0da6 -> :sswitch_7
        0x363419 -> :sswitch_6
        0x36ebcb -> :sswitch_5
        0x5c79410 -> :sswitch_4
        0x1093c0e0 -> :sswitch_3
        0x41012807 -> :sswitch_2
        0x414ef28f -> :sswitch_1
        0x6fbd6873 -> :sswitch_0
    .end sparse-switch

    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static g(D)Ljava/math/BigDecimal;
    .locals 1

    .line 1
    invoke-static {p0, p1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x6

    .line 6
    sget-object v0, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 7
    .line 8
    invoke-virtual {p0, p1, v0}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static h(Lio/sentry/android/core/SentryAndroidOptions;Landroid/view/View;FFLio/sentry/internal/gestures/a;)Lio/sentry/internal/gestures/b;
    .locals 17

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Lio/sentry/m6;->getGestureTargetLocators()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, Ljava/util/ArrayDeque;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v3, Lio/sentry/android/core/internal/gestures/i;

    .line 13
    .line 14
    move-object/from16 v4, p1

    .line 15
    .line 16
    move/from16 v5, p2

    .line 17
    .line 18
    move/from16 v6, p3

    .line 19
    .line 20
    invoke-direct {v3, v4, v5, v6}, Lio/sentry/android/core/internal/gestures/i;-><init>(Landroid/view/View;FF)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-nez v5, :cond_d

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    check-cast v5, Lio/sentry/android/core/internal/gestures/i;

    .line 38
    .line 39
    iget-object v6, v5, Lio/sentry/android/core/internal/gestures/i;->a:Landroid/view/View;

    .line 40
    .line 41
    iget v7, v5, Lio/sentry/android/core/internal/gestures/i;->c:F

    .line 42
    .line 43
    iget v5, v5, Lio/sentry/android/core/internal/gestures/i;->b:F

    .line 44
    .line 45
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    const/4 v10, 0x0

    .line 54
    cmpg-float v11, v5, v10

    .line 55
    .line 56
    if-ltz v11, :cond_0

    .line 57
    .line 58
    int-to-float v8, v8

    .line 59
    cmpl-float v8, v5, v8

    .line 60
    .line 61
    if-gtz v8, :cond_0

    .line 62
    .line 63
    cmpg-float v8, v7, v10

    .line 64
    .line 65
    if-ltz v8, :cond_0

    .line 66
    .line 67
    int-to-float v8, v9

    .line 68
    cmpl-float v8, v7, v8

    .line 69
    .line 70
    if-gtz v8, :cond_0

    .line 71
    .line 72
    instance-of v8, v6, Landroid/view/ViewGroup;

    .line 73
    .line 74
    if-eqz v8, :cond_4

    .line 75
    .line 76
    move-object v8, v6

    .line 77
    check-cast v8, Landroid/view/ViewGroup;

    .line 78
    .line 79
    invoke-virtual {v8}, Landroid/view/View;->getScrollX()I

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    invoke-virtual {v8}, Landroid/view/View;->getScrollY()I

    .line 84
    .line 85
    .line 86
    move-result v11

    .line 87
    const/4 v12, 0x0

    .line 88
    :goto_0
    invoke-virtual {v8}, Landroid/view/ViewGroup;->getChildCount()I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    if-ge v12, v13, :cond_4

    .line 93
    .line 94
    invoke-virtual {v8, v12}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object v13

    .line 98
    if-eqz v13, :cond_3

    .line 99
    .line 100
    int-to-float v14, v10

    .line 101
    add-float/2addr v14, v5

    .line 102
    invoke-virtual {v13}, Landroid/view/View;->getLeft()I

    .line 103
    .line 104
    .line 105
    move-result v15

    .line 106
    int-to-float v15, v15

    .line 107
    sub-float/2addr v14, v15

    .line 108
    int-to-float v15, v11

    .line 109
    add-float/2addr v15, v7

    .line 110
    invoke-virtual {v13}, Landroid/view/View;->getTop()I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    int-to-float v3, v3

    .line 115
    sub-float/2addr v15, v3

    .line 116
    invoke-virtual {v13}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    if-eqz v3, :cond_1

    .line 121
    .line 122
    invoke-virtual {v3}, Landroid/graphics/Matrix;->isIdentity()Z

    .line 123
    .line 124
    .line 125
    move-result v16

    .line 126
    if-nez v16, :cond_1

    .line 127
    .line 128
    const/16 p1, 0x0

    .line 129
    .line 130
    new-instance v9, Landroid/graphics/Matrix;

    .line 131
    .line 132
    invoke-direct {v9}, Landroid/graphics/Matrix;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3, v9}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    if-eqz v3, :cond_2

    .line 140
    .line 141
    const/4 v3, 0x2

    .line 142
    new-array v3, v3, [F

    .line 143
    .line 144
    aput v14, v3, p1

    .line 145
    .line 146
    const/4 v14, 0x1

    .line 147
    aput v15, v3, v14

    .line 148
    .line 149
    invoke-virtual {v9, v3}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 150
    .line 151
    .line 152
    aget v9, v3, p1

    .line 153
    .line 154
    aget v15, v3, v14

    .line 155
    .line 156
    move v14, v9

    .line 157
    goto :goto_1

    .line 158
    :cond_1
    const/16 p1, 0x0

    .line 159
    .line 160
    :cond_2
    :goto_1
    new-instance v3, Lio/sentry/android/core/internal/gestures/i;

    .line 161
    .line 162
    invoke-direct {v3, v13, v14, v15}, Lio/sentry/android/core/internal/gestures/i;-><init>(Landroid/view/View;FF)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_3
    const/16 p1, 0x0

    .line 170
    .line 171
    :goto_2
    add-int/lit8 v12, v12, 0x1

    .line 172
    .line 173
    goto :goto_0

    .line 174
    :cond_4
    const/16 p1, 0x0

    .line 175
    .line 176
    move/from16 v3, p1

    .line 177
    .line 178
    :goto_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    if-ge v3, v5, :cond_0

    .line 183
    .line 184
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    check-cast v5, Lio/sentry/android/core/internal/gestures/a;

    .line 189
    .line 190
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    sget-object v7, Lio/sentry/internal/gestures/a;->CLICKABLE:Lio/sentry/internal/gestures/a;

    .line 194
    .line 195
    if-ne v0, v7, :cond_6

    .line 196
    .line 197
    invoke-virtual {v6}, Landroid/view/View;->isClickable()Z

    .line 198
    .line 199
    .line 200
    move-result v8

    .line 201
    if-eqz v8, :cond_6

    .line 202
    .line 203
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 204
    .line 205
    .line 206
    move-result v8

    .line 207
    if-nez v8, :cond_6

    .line 208
    .line 209
    invoke-static {v6}, Lio/sentry/config/a;->o(Landroid/view/View;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    if-nez v5, :cond_5

    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_5
    invoke-static {v6}, Lio/sentry/config/a;->k(Landroid/view/KeyEvent$Callback;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    new-instance v9, Lio/sentry/internal/gestures/b;

    .line 221
    .line 222
    invoke-direct {v9, v6, v8, v5}, Lio/sentry/internal/gestures/b;-><init>(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_6
    sget-object v8, Lio/sentry/internal/gestures/a;->SCROLLABLE:Lio/sentry/internal/gestures/a;

    .line 227
    .line 228
    if-ne v0, v8, :cond_a

    .line 229
    .line 230
    iget-object v5, v5, Lio/sentry/android/core/internal/gestures/a;->a:Lio/sentry/util/g;

    .line 231
    .line 232
    invoke-virtual {v5}, Lio/sentry/util/g;->a()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    check-cast v5, Ljava/lang/Boolean;

    .line 237
    .line 238
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    if-nez v5, :cond_7

    .line 243
    .line 244
    move/from16 v5, p1

    .line 245
    .line 246
    goto :goto_4

    .line 247
    :cond_7
    const-class v5, Landroidx/core/view/ScrollingView;

    .line 248
    .line 249
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    move-result-object v8

    .line 253
    invoke-virtual {v5, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 254
    .line 255
    .line 256
    move-result v5

    .line 257
    :goto_4
    if-nez v5, :cond_8

    .line 258
    .line 259
    const-class v5, Landroid/widget/AbsListView;

    .line 260
    .line 261
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    move-result-object v8

    .line 265
    invoke-virtual {v5, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 266
    .line 267
    .line 268
    move-result v5

    .line 269
    if-nez v5, :cond_8

    .line 270
    .line 271
    const-class v5, Landroid/widget/ScrollView;

    .line 272
    .line 273
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    move-result-object v8

    .line 277
    invoke-virtual {v5, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 278
    .line 279
    .line 280
    move-result v5

    .line 281
    if-eqz v5, :cond_a

    .line 282
    .line 283
    :cond_8
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 284
    .line 285
    .line 286
    move-result v5

    .line 287
    if-nez v5, :cond_a

    .line 288
    .line 289
    invoke-static {v6}, Lio/sentry/config/a;->o(Landroid/view/View;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v5

    .line 293
    if-nez v5, :cond_9

    .line 294
    .line 295
    goto :goto_5

    .line 296
    :cond_9
    invoke-static {v6}, Lio/sentry/config/a;->k(Landroid/view/KeyEvent$Callback;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v8

    .line 300
    new-instance v9, Lio/sentry/internal/gestures/b;

    .line 301
    .line 302
    invoke-direct {v9, v6, v8, v5}, Lio/sentry/internal/gestures/b;-><init>(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    goto :goto_6

    .line 306
    :cond_a
    :goto_5
    const/4 v9, 0x0

    .line 307
    :goto_6
    if-eqz v9, :cond_c

    .line 308
    .line 309
    if-ne v0, v7, :cond_b

    .line 310
    .line 311
    move-object v4, v9

    .line 312
    goto :goto_7

    .line 313
    :cond_b
    sget-object v5, Lio/sentry/internal/gestures/a;->SCROLLABLE:Lio/sentry/internal/gestures/a;

    .line 314
    .line 315
    if-ne v0, v5, :cond_c

    .line 316
    .line 317
    return-object v9

    .line 318
    :cond_c
    :goto_7
    add-int/lit8 v3, v3, 0x1

    .line 319
    .line 320
    goto/16 :goto_3

    .line 321
    .line 322
    :cond_d
    return-object v4
.end method

.method public static i(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/h;Lta;)Lio/sentry/android/replay/viewhierarchy/h;
    .locals 12

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    if-eqz v2, :cond_5

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getWindowVisibility()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 19
    .line 20
    new-instance v6, Lkotlin/Pair;

    .line 21
    .line 22
    invoke-direct {v6, v2, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_3

    .line 26
    :cond_0
    move-object v2, p0

    .line 27
    :goto_0
    instance-of v6, v2, Landroid/view/View;

    .line 28
    .line 29
    if-eqz v6, :cond_4

    .line 30
    .line 31
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 32
    .line 33
    const/16 v7, 0x1d

    .line 34
    .line 35
    if-lt v6, v7, :cond_1

    .line 36
    .line 37
    move-object v6, v2

    .line 38
    check-cast v6, Landroid/view/View;

    .line 39
    .line 40
    invoke-static {v6}, Lio/sentry/android/core/l0;->a(Landroid/view/View;)F

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const/high16 v6, 0x3f800000    # 1.0f

    .line 46
    .line 47
    :goto_1
    check-cast v2, Landroid/view/View;

    .line 48
    .line 49
    invoke-virtual {v2}, Landroid/view/View;->getAlpha()F

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    cmpg-float v7, v7, v3

    .line 54
    .line 55
    if-lez v7, :cond_3

    .line 56
    .line 57
    cmpg-float v6, v6, v3

    .line 58
    .line 59
    if-lez v6, :cond_3

    .line 60
    .line 61
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-eqz v6, :cond_2

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    goto :goto_0

    .line 73
    :cond_3
    :goto_2
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 74
    .line 75
    new-instance v6, Lkotlin/Pair;

    .line 76
    .line 77
    invoke-direct {v6, v2, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_4
    new-instance v2, Landroid/graphics/Rect;

    .line 82
    .line 83
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 84
    .line 85
    .line 86
    new-instance v6, Landroid/graphics/Point;

    .line 87
    .line 88
    invoke-direct {v6}, Landroid/graphics/Point;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, v2, v6}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;Landroid/graphics/Point;)Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    new-instance v7, Lkotlin/Pair;

    .line 100
    .line 101
    invoke-direct {v7, v6, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    move-object v6, v7

    .line 105
    goto :goto_3

    .line 106
    :cond_5
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 107
    .line 108
    new-instance v6, Lkotlin/Pair;

    .line 109
    .line 110
    invoke-direct {v6, v2, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :goto_3
    iget-object v2, v6, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v2, Ljava/lang/Boolean;

    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    iget-object v2, v6, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 122
    .line 123
    move-object v8, v2

    .line 124
    check-cast v8, Landroid/graphics/Rect;

    .line 125
    .line 126
    const/4 v2, 0x0

    .line 127
    const/4 v6, 0x1

    .line 128
    if-eqz v7, :cond_10

    .line 129
    .line 130
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v9

    .line 134
    instance-of v10, v9, Ljava/lang/String;

    .line 135
    .line 136
    if-eqz v10, :cond_6

    .line 137
    .line 138
    check-cast v9, Ljava/lang/String;

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_6
    move-object v9, v5

    .line 142
    :goto_4
    if-eqz v9, :cond_7

    .line 143
    .line 144
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 145
    .line 146
    invoke-virtual {v9, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v9

    .line 150
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    const-string v10, "sentry-unmask"

    .line 154
    .line 155
    invoke-static {v9, v10, v2}, Lkotlin/text/StringsKt;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 156
    .line 157
    .line 158
    move-result v9

    .line 159
    if-ne v9, v6, :cond_7

    .line 160
    .line 161
    goto :goto_5

    .line 162
    :cond_7
    sget v9, Lio/sentry/android/replay/R$id;->sentry_privacy:I

    .line 163
    .line 164
    invoke-virtual {p0, v9}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v9

    .line 168
    const-string v10, "unmask"

    .line 169
    .line 170
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v9

    .line 174
    if-eqz v9, :cond_8

    .line 175
    .line 176
    :goto_5
    invoke-virtual {p2}, Lta;->r()V

    .line 177
    .line 178
    .line 179
    goto/16 :goto_b

    .line 180
    .line 181
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v9

    .line 185
    instance-of v10, v9, Ljava/lang/String;

    .line 186
    .line 187
    if-eqz v10, :cond_9

    .line 188
    .line 189
    check-cast v9, Ljava/lang/String;

    .line 190
    .line 191
    goto :goto_6

    .line 192
    :cond_9
    move-object v9, v5

    .line 193
    :goto_6
    if-eqz v9, :cond_a

    .line 194
    .line 195
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 196
    .line 197
    invoke-virtual {v9, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v9

    .line 201
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    const-string v10, "sentry-mask"

    .line 205
    .line 206
    invoke-static {v9, v10, v2}, Lkotlin/text/StringsKt;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 207
    .line 208
    .line 209
    move-result v9

    .line 210
    if-ne v9, v6, :cond_a

    .line 211
    .line 212
    goto :goto_7

    .line 213
    :cond_a
    sget v9, Lio/sentry/android/replay/R$id;->sentry_privacy:I

    .line 214
    .line 215
    invoke-virtual {p0, v9}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v9

    .line 219
    const-string v10, "mask"

    .line 220
    .line 221
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v9

    .line 225
    if-eqz v9, :cond_b

    .line 226
    .line 227
    :goto_7
    invoke-virtual {p2}, Lta;->r()V

    .line 228
    .line 229
    .line 230
    goto :goto_a

    .line 231
    :cond_b
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 232
    .line 233
    .line 234
    move-result-object v9

    .line 235
    if-eqz v9, :cond_c

    .line 236
    .line 237
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 238
    .line 239
    .line 240
    move-result-object v9

    .line 241
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    :cond_c
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    move-result-object v9

    .line 248
    iget-object v10, p2, Lta;->b:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v10, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 251
    .line 252
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    :goto_8
    if-eqz v9, :cond_e

    .line 256
    .line 257
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v11

    .line 261
    invoke-virtual {v10, v11}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v11

    .line 265
    if-eqz v11, :cond_d

    .line 266
    .line 267
    goto :goto_b

    .line 268
    :cond_d
    invoke-virtual {v9}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    move-result-object v9

    .line 272
    goto :goto_8

    .line 273
    :cond_e
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    move-result-object v9

    .line 277
    iget-object v1, p2, Lta;->a:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 280
    .line 281
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    :goto_9
    if-eqz v9, :cond_10

    .line 285
    .line 286
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v10

    .line 290
    invoke-virtual {v1, v10}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v10

    .line 294
    if-eqz v10, :cond_f

    .line 295
    .line 296
    :goto_a
    move v9, v6

    .line 297
    goto :goto_c

    .line 298
    :cond_f
    invoke-virtual {v9}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    move-result-object v9

    .line 302
    goto :goto_9

    .line 303
    :cond_10
    :goto_b
    move v9, v2

    .line 304
    :goto_c
    instance-of v1, p0, Landroid/widget/TextView;

    .line 305
    .line 306
    if-eqz v1, :cond_13

    .line 307
    .line 308
    move-object v0, p0

    .line 309
    check-cast v0, Landroid/widget/TextView;

    .line 310
    .line 311
    invoke-virtual {v0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    if-eqz v1, :cond_11

    .line 316
    .line 317
    new-instance v5, Lio/sentry/s6;

    .line 318
    .line 319
    const/4 v2, 0x4

    .line 320
    invoke-direct {v5, v1, v2}, Lio/sentry/s6;-><init>(Ljava/lang/Object;I)V

    .line 321
    .line 322
    .line 323
    :cond_11
    move-object v1, v5

    .line 324
    invoke-virtual {v0}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 325
    .line 326
    .line 327
    move-result v2

    .line 328
    const/high16 v5, -0x1000000

    .line 329
    .line 330
    or-int/2addr v2, v5

    .line 331
    move v5, v3

    .line 332
    invoke-virtual {v0}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    .line 333
    .line 334
    .line 335
    move-result v3

    .line 336
    :try_start_0
    invoke-virtual {v0}, Landroid/widget/TextView;->getTotalPaddingTop()I

    .line 337
    .line 338
    .line 339
    move-result v6
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 340
    goto :goto_d

    .line 341
    :catch_0
    invoke-virtual {v0}, Landroid/widget/TextView;->getExtendedPaddingTop()I

    .line 342
    .line 343
    .line 344
    move-result v6

    .line 345
    :goto_d
    invoke-virtual {v0}, Landroid/view/View;->getX()F

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 349
    .line 350
    .line 351
    move v10, v5

    .line 352
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 353
    .line 354
    .line 355
    move-result v5

    .line 356
    move v11, v6

    .line 357
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 358
    .line 359
    .line 360
    move-result v6

    .line 361
    if-eqz p1, :cond_12

    .line 362
    .line 363
    iget v10, p1, Lio/sentry/android/replay/viewhierarchy/h;->c:F

    .line 364
    .line 365
    :cond_12
    invoke-virtual {v0}, Landroid/view/View;->getElevation()F

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    add-float/2addr v0, v10

    .line 370
    move v10, v7

    .line 371
    move v7, v0

    .line 372
    new-instance v0, Lio/sentry/android/replay/viewhierarchy/g;

    .line 373
    .line 374
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    move v4, v11

    .line 379
    move-object v11, v8

    .line 380
    move-object v8, p1

    .line 381
    invoke-direct/range {v0 .. v11}, Lio/sentry/android/replay/viewhierarchy/g;-><init>(Lio/sentry/android/replay/util/l;Ljava/lang/Integer;IIIIFLio/sentry/android/replay/viewhierarchy/h;ZZLandroid/graphics/Rect;)V

    .line 382
    .line 383
    .line 384
    return-object v0

    .line 385
    :cond_13
    move v10, v3

    .line 386
    move v5, v9

    .line 387
    instance-of v1, p0, Landroid/widget/ImageView;

    .line 388
    .line 389
    if-eqz v1, :cond_1c

    .line 390
    .line 391
    move-object v0, p0

    .line 392
    check-cast v0, Landroid/widget/ImageView;

    .line 393
    .line 394
    invoke-virtual {v0}, Landroid/view/View;->getX()F

    .line 395
    .line 396
    .line 397
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 398
    .line 399
    .line 400
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 401
    .line 402
    .line 403
    move-result v1

    .line 404
    move v3, v2

    .line 405
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 406
    .line 407
    .line 408
    move-result v2

    .line 409
    if-eqz p1, :cond_14

    .line 410
    .line 411
    iget v9, p1, Lio/sentry/android/replay/viewhierarchy/h;->c:F

    .line 412
    .line 413
    goto :goto_e

    .line 414
    :cond_14
    move v9, v10

    .line 415
    :goto_e
    invoke-virtual {v0}, Landroid/view/View;->getElevation()F

    .line 416
    .line 417
    .line 418
    move-result v10

    .line 419
    add-float/2addr v10, v9

    .line 420
    if-eqz v5, :cond_1b

    .line 421
    .line 422
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    if-eqz v0, :cond_1b

    .line 427
    .line 428
    instance-of v5, v0, Landroid/graphics/drawable/InsetDrawable;

    .line 429
    .line 430
    if-eqz v5, :cond_15

    .line 431
    .line 432
    move v5, v6

    .line 433
    goto :goto_f

    .line 434
    :cond_15
    instance-of v5, v0, Landroid/graphics/drawable/ColorDrawable;

    .line 435
    .line 436
    :goto_f
    if-eqz v5, :cond_16

    .line 437
    .line 438
    move v5, v6

    .line 439
    goto :goto_10

    .line 440
    :cond_16
    instance-of v5, v0, Landroid/graphics/drawable/VectorDrawable;

    .line 441
    .line 442
    :goto_10
    if-eqz v5, :cond_17

    .line 443
    .line 444
    move v5, v6

    .line 445
    goto :goto_11

    .line 446
    :cond_17
    instance-of v5, v0, Landroid/graphics/drawable/GradientDrawable;

    .line 447
    .line 448
    :goto_11
    if-eqz v5, :cond_18

    .line 449
    .line 450
    goto :goto_12

    .line 451
    :cond_18
    instance-of v5, v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 452
    .line 453
    if-eqz v5, :cond_1a

    .line 454
    .line 455
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 456
    .line 457
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    if-nez v0, :cond_19

    .line 462
    .line 463
    goto :goto_12

    .line 464
    :cond_19
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 465
    .line 466
    .line 467
    move-result v5

    .line 468
    if-nez v5, :cond_1b

    .line 469
    .line 470
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 471
    .line 472
    .line 473
    move-result v5

    .line 474
    const/16 v9, 0xa

    .line 475
    .line 476
    if-le v5, v9, :cond_1b

    .line 477
    .line 478
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 479
    .line 480
    .line 481
    move-result v0

    .line 482
    if-le v0, v9, :cond_1b

    .line 483
    .line 484
    :cond_1a
    move v5, v6

    .line 485
    goto :goto_13

    .line 486
    :cond_1b
    :goto_12
    move v5, v3

    .line 487
    :goto_13
    new-instance v0, Lio/sentry/android/replay/viewhierarchy/e;

    .line 488
    .line 489
    move-object v4, p1

    .line 490
    move v6, v7

    .line 491
    move-object v7, v8

    .line 492
    move v3, v10

    .line 493
    invoke-direct/range {v0 .. v7}, Lio/sentry/android/replay/viewhierarchy/h;-><init>(IIFLio/sentry/android/replay/viewhierarchy/h;ZZLandroid/graphics/Rect;)V

    .line 494
    .line 495
    .line 496
    return-object v0

    .line 497
    :cond_1c
    move v6, v7

    .line 498
    move-object v7, v8

    .line 499
    instance-of v1, p0, Landroid/view/SurfaceView;

    .line 500
    .line 501
    if-eqz v1, :cond_1e

    .line 502
    .line 503
    new-instance v1, Lio/sentry/android/replay/viewhierarchy/f;

    .line 504
    .line 505
    move-object v2, v1

    .line 506
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 507
    .line 508
    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    move-object v0, p0

    .line 512
    check-cast v0, Landroid/view/SurfaceView;

    .line 513
    .line 514
    invoke-virtual {v0}, Landroid/view/View;->getX()F

    .line 515
    .line 516
    .line 517
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 518
    .line 519
    .line 520
    move-object v3, v0

    .line 521
    move-object v0, v2

    .line 522
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 523
    .line 524
    .line 525
    move-result v2

    .line 526
    move-object v8, v3

    .line 527
    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    .line 528
    .line 529
    .line 530
    move-result v3

    .line 531
    if-eqz p1, :cond_1d

    .line 532
    .line 533
    iget v9, p1, Lio/sentry/android/replay/viewhierarchy/h;->c:F

    .line 534
    .line 535
    goto :goto_14

    .line 536
    :cond_1d
    move v9, v10

    .line 537
    :goto_14
    invoke-virtual {v8}, Landroid/view/View;->getElevation()F

    .line 538
    .line 539
    .line 540
    move-result v8

    .line 541
    add-float/2addr v8, v9

    .line 542
    move v4, v8

    .line 543
    move-object v8, v7

    .line 544
    move v7, v6

    .line 545
    move v6, v5

    .line 546
    move-object v5, p1

    .line 547
    invoke-direct/range {v0 .. v8}, Lio/sentry/android/replay/viewhierarchy/f;-><init>(Ljava/lang/ref/WeakReference;IIFLio/sentry/android/replay/viewhierarchy/h;ZZLandroid/graphics/Rect;)V

    .line 548
    .line 549
    .line 550
    return-object v0

    .line 551
    :cond_1e
    new-instance v0, Lio/sentry/android/replay/viewhierarchy/d;

    .line 552
    .line 553
    invoke-virtual {p0}, Landroid/view/View;->getX()F

    .line 554
    .line 555
    .line 556
    invoke-virtual {p0}, Landroid/view/View;->getY()F

    .line 557
    .line 558
    .line 559
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 560
    .line 561
    .line 562
    move-result v1

    .line 563
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 564
    .line 565
    .line 566
    move-result v2

    .line 567
    if-eqz p1, :cond_1f

    .line 568
    .line 569
    iget v3, p1, Lio/sentry/android/replay/viewhierarchy/h;->c:F

    .line 570
    .line 571
    goto :goto_15

    .line 572
    :cond_1f
    move v3, v10

    .line 573
    :goto_15
    invoke-virtual {p0}, Landroid/view/View;->getElevation()F

    .line 574
    .line 575
    .line 576
    move-result v8

    .line 577
    add-float/2addr v3, v8

    .line 578
    move-object v4, p1

    .line 579
    invoke-direct/range {v0 .. v7}, Lio/sentry/android/replay/viewhierarchy/h;-><init>(IIFLio/sentry/android/replay/viewhierarchy/h;ZZLandroid/graphics/Rect;)V

    .line 580
    .line 581
    .line 582
    return-object v0
.end method

.method public static j()Ljava/lang/String;
    .locals 10

    .line 1
    invoke-static {}, Lio/sentry/util/m;->a()Lio/sentry/util/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x10

    .line 6
    .line 7
    new-array v2, v1, [B

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Lio/sentry/util/l;->b([B)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x6

    .line 13
    aget-byte v3, v2, v0

    .line 14
    .line 15
    and-int/lit8 v3, v3, 0xf

    .line 16
    .line 17
    int-to-byte v3, v3

    .line 18
    aput-byte v3, v2, v0

    .line 19
    .line 20
    or-int/lit8 v3, v3, 0x40

    .line 21
    .line 22
    int-to-byte v3, v3

    .line 23
    aput-byte v3, v2, v0

    .line 24
    .line 25
    const/16 v0, 0x8

    .line 26
    .line 27
    aget-byte v3, v2, v0

    .line 28
    .line 29
    and-int/lit8 v3, v3, 0x3f

    .line 30
    .line 31
    int-to-byte v3, v3

    .line 32
    aput-byte v3, v2, v0

    .line 33
    .line 34
    or-int/lit16 v3, v3, 0x80

    .line 35
    .line 36
    int-to-byte v3, v3

    .line 37
    aput-byte v3, v2, v0

    .line 38
    .line 39
    const-wide/16 v3, 0x0

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    move-wide v6, v3

    .line 43
    :goto_0
    if-ge v5, v0, :cond_0

    .line 44
    .line 45
    shl-long/2addr v6, v0

    .line 46
    aget-byte v8, v2, v5

    .line 47
    .line 48
    and-int/lit16 v8, v8, 0xff

    .line 49
    .line 50
    int-to-long v8, v8

    .line 51
    or-long/2addr v6, v8

    .line 52
    add-int/lit8 v5, v5, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move v5, v0

    .line 56
    :goto_1
    if-ge v5, v1, :cond_1

    .line 57
    .line 58
    shl-long/2addr v3, v0

    .line 59
    aget-byte v8, v2, v5

    .line 60
    .line 61
    and-int/lit16 v8, v8, 0xff

    .line 62
    .line 63
    int-to-long v8, v8

    .line 64
    or-long/2addr v3, v8

    .line 65
    add-int/lit8 v5, v5, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    new-instance v0, Ljava/util/UUID;

    .line 69
    .line 70
    invoke-direct {v0, v6, v7, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    .line 71
    .line 72
    .line 73
    invoke-static {v0}, Lio/sentry/util/p;->b(Ljava/util/UUID;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    return-object v0
.end method

.method public static k(Landroid/view/KeyEvent$Callback;)Ljava/lang/String;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public static l(Ljava/lang/String;)Ljava/util/Date;
    .locals 3

    .line 1
    :try_start_0
    invoke-static {p0}, Lio/sentry/vendor/a;->h(Ljava/lang/String;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    new-instance v2, Ljava/util/Date;

    .line 6
    .line 7
    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    return-object v2

    .line 11
    :catch_0
    const-string v0, "timestamp is not ISO format "

    .line 12
    .line 13
    invoke-static {v0, p0}, Len;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method

.method public static m(Ljava/lang/String;)Ljava/util/Date;
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Ljava/math/BigDecimal;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 7
    .line 8
    const/4 v2, 0x3

    .line 9
    invoke-virtual {v0, v2, v1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, v2}, Ljava/math/BigDecimal;->movePointRight(I)Ljava/math/BigDecimal;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/math/BigDecimal;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    new-instance v2, Ljava/util/Date;

    .line 22
    .line 23
    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    return-object v2

    .line 27
    :catch_0
    const-string v0, "timestamp is not millis format "

    .line 28
    .line 29
    invoke-static {v0, p0}, Len;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    return-object p0
.end method

.method public static final n(Landroid/view/View;)Landroid/view/Window;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lio/sentry/android/replay/g0;->a:Lp51;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object v0, Lio/sentry/android/replay/g0;->a:Lp51;

    .line 14
    .line 15
    invoke-interface {v0}, Lp51;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/lang/Class;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    sget-object v0, Lio/sentry/android/replay/g0;->b:Lp51;

    .line 30
    .line 31
    invoke-interface {v0}, Lp51;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/lang/reflect/Field;

    .line 36
    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    check-cast p0, Landroid/view/Window;

    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_0
    const/4 p0, 0x0

    .line 50
    return-object p0
.end method

.method public static o(Landroid/view/View;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eq v0, v1, :cond_2

    .line 8
    .line 9
    const/high16 v1, -0x1000000

    .line 10
    .line 11
    and-int/2addr v1, v0

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    const v1, 0xffffff

    .line 15
    .line 16
    .line 17
    and-int/2addr v1, v0

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    if-nez p0, :cond_1

    .line 30
    .line 31
    const-string p0, ""

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_1
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    return-object p0

    .line 39
    :catch_0
    :cond_2
    :goto_0
    return-object v2
.end method

.method public static q(J)Ljava/lang/String;
    .locals 20

    .line 1
    move-wide/from16 v0, p0

    .line 2
    .line 3
    const-wide v2, -0xb1d069b5400L

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v2, v0, v2

    .line 9
    .line 10
    const/16 v4, 0x2e

    .line 11
    .line 12
    const/16 v5, 0x54

    .line 13
    .line 14
    const/4 v6, 0x5

    .line 15
    const/16 v7, 0x18

    .line 16
    .line 17
    const/4 v8, 0x3

    .line 18
    const/16 v9, 0x3a

    .line 19
    .line 20
    const/16 v10, 0x2d

    .line 21
    .line 22
    const/4 v11, 0x4

    .line 23
    const/4 v12, 0x1

    .line 24
    const/4 v13, 0x0

    .line 25
    const/4 v14, 0x2

    .line 26
    if-gez v2, :cond_0

    .line 27
    .line 28
    new-instance v2, Ljava/util/GregorianCalendar;

    .line 29
    .line 30
    new-instance v15, Ljava/util/SimpleTimeZone;

    .line 31
    .line 32
    const-string v3, "UTC"

    .line 33
    .line 34
    invoke-direct {v15, v13, v3}, Ljava/util/SimpleTimeZone;-><init>(ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {v2, v15}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/TimeZone;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 41
    .line 42
    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v12}, Ljava/util/Calendar;->get(I)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-static {v0, v1, v11}, Lio/sentry/vendor/a;->f(Ljava/lang/StringBuilder;II)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v14}, Ljava/util/Calendar;->get(I)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    add-int/2addr v1, v12

    .line 63
    invoke-static {v0, v1, v14}, Lio/sentry/vendor/a;->f(Ljava/lang/StringBuilder;II)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v6}, Ljava/util/Calendar;->get(I)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-static {v0, v1, v14}, Lio/sentry/vendor/a;->f(Ljava/lang/StringBuilder;II)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const/16 v1, 0xb

    .line 80
    .line 81
    invoke-virtual {v2, v1}, Ljava/util/Calendar;->get(I)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-static {v0, v1, v14}, Lio/sentry/vendor/a;->f(Ljava/lang/StringBuilder;II)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const/16 v1, 0xc

    .line 92
    .line 93
    invoke-virtual {v2, v1}, Ljava/util/Calendar;->get(I)I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    invoke-static {v0, v1, v14}, Lio/sentry/vendor/a;->f(Ljava/lang/StringBuilder;II)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const/16 v1, 0xd

    .line 104
    .line 105
    invoke-virtual {v2, v1}, Ljava/util/Calendar;->get(I)I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    invoke-static {v0, v1, v14}, Lio/sentry/vendor/a;->f(Ljava/lang/StringBuilder;II)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const/16 v1, 0xe

    .line 116
    .line 117
    invoke-virtual {v2, v1}, Ljava/util/Calendar;->get(I)I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    invoke-static {v0, v1, v8}, Lio/sentry/vendor/a;->f(Ljava/lang/StringBuilder;II)V

    .line 122
    .line 123
    .line 124
    const/16 v1, 0x5a

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    return-object v0

    .line 134
    :cond_0
    const-wide/32 v2, 0x5265c00

    .line 135
    .line 136
    .line 137
    invoke-static {v0, v1, v2, v3}, Lio/sentry/vendor/a;->e(JJ)J

    .line 138
    .line 139
    .line 140
    move-result-wide v16

    .line 141
    invoke-static {v0, v1, v2, v3}, Lio/sentry/vendor/a;->e(JJ)J

    .line 142
    .line 143
    .line 144
    move-result-wide v18

    .line 145
    mul-long v18, v18, v2

    .line 146
    .line 147
    sub-long v0, v0, v18

    .line 148
    .line 149
    long-to-int v0, v0

    .line 150
    const-wide/32 v1, 0xafa6c

    .line 151
    .line 152
    .line 153
    add-long v1, v16, v1

    .line 154
    .line 155
    move v15, v12

    .line 156
    move v3, v13

    .line 157
    const-wide/32 v12, 0x23ab1

    .line 158
    .line 159
    .line 160
    invoke-static {v1, v2, v12, v13}, Lio/sentry/vendor/a;->e(JJ)J

    .line 161
    .line 162
    .line 163
    move-result-wide v16

    .line 164
    mul-long v12, v12, v16

    .line 165
    .line 166
    sub-long/2addr v1, v12

    .line 167
    long-to-int v1, v1

    .line 168
    div-int/lit16 v2, v1, 0x5b4

    .line 169
    .line 170
    sub-int v2, v1, v2

    .line 171
    .line 172
    const v12, 0x8eac

    .line 173
    .line 174
    .line 175
    div-int v12, v1, v12

    .line 176
    .line 177
    add-int/2addr v12, v2

    .line 178
    const v2, 0x23ab0

    .line 179
    .line 180
    .line 181
    div-int v2, v1, v2

    .line 182
    .line 183
    sub-int/2addr v12, v2

    .line 184
    div-int/lit16 v12, v12, 0x16d

    .line 185
    .line 186
    move/from16 p0, v3

    .line 187
    .line 188
    int-to-long v3, v12

    .line 189
    const-wide/16 v18, 0x190

    .line 190
    .line 191
    mul-long v16, v16, v18

    .line 192
    .line 193
    add-long v3, v16, v3

    .line 194
    .line 195
    long-to-int v3, v3

    .line 196
    mul-int/lit16 v4, v12, 0x16d

    .line 197
    .line 198
    div-int/lit8 v13, v12, 0x4

    .line 199
    .line 200
    add-int/2addr v13, v4

    .line 201
    div-int/lit8 v12, v12, 0x64

    .line 202
    .line 203
    sub-int/2addr v13, v12

    .line 204
    sub-int/2addr v1, v13

    .line 205
    mul-int/lit8 v4, v1, 0x5

    .line 206
    .line 207
    add-int/2addr v4, v14

    .line 208
    div-int/lit16 v4, v4, 0x99

    .line 209
    .line 210
    mul-int/lit16 v12, v4, 0x99

    .line 211
    .line 212
    add-int/2addr v12, v14

    .line 213
    div-int/2addr v12, v6

    .line 214
    sub-int/2addr v1, v12

    .line 215
    add-int/2addr v1, v15

    .line 216
    const/16 v6, 0xa

    .line 217
    .line 218
    if-ge v4, v6, :cond_1

    .line 219
    .line 220
    add-int/2addr v4, v8

    .line 221
    goto :goto_0

    .line 222
    :cond_1
    add-int/lit8 v4, v4, -0x9

    .line 223
    .line 224
    :goto_0
    if-gt v4, v14, :cond_2

    .line 225
    .line 226
    move v6, v15

    .line 227
    goto :goto_1

    .line 228
    :cond_2
    move/from16 v6, p0

    .line 229
    .line 230
    :goto_1
    add-int/2addr v3, v6

    .line 231
    filled-new-array {v3, v4, v1}, [I

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    const v3, 0x36ee80

    .line 236
    .line 237
    .line 238
    div-int v4, v0, v3

    .line 239
    .line 240
    mul-int/2addr v3, v4

    .line 241
    sub-int/2addr v0, v3

    .line 242
    const v3, 0xea60

    .line 243
    .line 244
    .line 245
    div-int v6, v0, v3

    .line 246
    .line 247
    mul-int/2addr v3, v6

    .line 248
    sub-int/2addr v0, v3

    .line 249
    div-int/lit16 v3, v0, 0x3e8

    .line 250
    .line 251
    mul-int/lit16 v12, v3, 0x3e8

    .line 252
    .line 253
    sub-int/2addr v0, v12

    .line 254
    new-instance v12, Ljava/lang/StringBuilder;

    .line 255
    .line 256
    invoke-direct {v12, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 257
    .line 258
    .line 259
    aget v7, v1, p0

    .line 260
    .line 261
    invoke-static {v12, v7, v11}, Lio/sentry/vendor/a;->f(Ljava/lang/StringBuilder;II)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    aget v7, v1, v15

    .line 268
    .line 269
    invoke-static {v12, v7, v14}, Lio/sentry/vendor/a;->f(Ljava/lang/StringBuilder;II)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    aget v1, v1, v14

    .line 276
    .line 277
    invoke-static {v12, v1, v14}, Lio/sentry/vendor/a;->f(Ljava/lang/StringBuilder;II)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-static {v12, v4, v14}, Lio/sentry/vendor/a;->f(Ljava/lang/StringBuilder;II)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-static {v12, v6, v14}, Lio/sentry/vendor/a;->f(Ljava/lang/StringBuilder;II)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-static {v12, v3, v14}, Lio/sentry/vendor/a;->f(Ljava/lang/StringBuilder;II)V

    .line 296
    .line 297
    .line 298
    const/16 v2, 0x2e

    .line 299
    .line 300
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-static {v12, v0, v8}, Lio/sentry/vendor/a;->f(Ljava/lang/StringBuilder;II)V

    .line 304
    .line 305
    .line 306
    const/16 v1, 0x5a

    .line 307
    .line 308
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    return-object v0
.end method

.method public static r(Landroid/content/Context;)Z
    .locals 3

    .line 1
    const-string v0, "The application context is required."

    .line 2
    .line 3
    invoke-static {p0, v0}, Lio/sentry/util/c;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const-string v2, "android.permission.ACCESS_NETWORK_STATE"

    .line 15
    .line 16
    invoke-virtual {p0, v2, v0, v1}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public static t(Ljava/io/InputStream;)[B
    .locals 6

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x400

    .line 7
    .line 8
    :try_start_0
    new-array v2, v1, [B

    .line 9
    .line 10
    :goto_0
    const/4 v3, 0x0

    .line 11
    invoke-virtual {p0, v2, v3, v1}, Ljava/io/InputStream;->read([BII)I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    const/4 v5, -0x1

    .line 16
    if-eq v4, v5, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, v2, v3, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 25
    .line 26
    .line 27
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    .line 34
    .line 35
    goto :goto_2

    .line 36
    :catchall_1
    move-exception v0

    .line 37
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    :goto_2
    throw p0
.end method

.method public static u(Lio/sentry/q4;Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/q4;->a:Lio/sentry/protocol/w;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "event_id"

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lio/sentry/q4;->a:Lio/sentry/protocol/w;

    .line 11
    .line 12
    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->v(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    .line 13
    .line 14
    .line 15
    :cond_0
    const-string v0, "contexts"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lio/sentry/q4;->b:Lio/sentry/protocol/e;

    .line 21
    .line 22
    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->v(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lio/sentry/q4;->c:Lio/sentry/protocol/u;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    const-string v0, "sdk"

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lio/sentry/q4;->c:Lio/sentry/protocol/u;

    .line 35
    .line 36
    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->v(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    .line 37
    .line 38
    .line 39
    :cond_1
    iget-object v0, p0, Lio/sentry/q4;->d:Lio/sentry/protocol/r;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    const-string v0, "request"

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lio/sentry/q4;->d:Lio/sentry/protocol/r;

    .line 49
    .line 50
    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->v(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    .line 51
    .line 52
    .line 53
    :cond_2
    iget-object v0, p0, Lio/sentry/q4;->e:Ljava/util/AbstractMap;

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_3

    .line 62
    .line 63
    const-string v0, "tags"

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lio/sentry/q4;->e:Ljava/util/AbstractMap;

    .line 69
    .line 70
    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->v(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    .line 71
    .line 72
    .line 73
    :cond_3
    iget-object v0, p0, Lio/sentry/q4;->f:Ljava/lang/String;

    .line 74
    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    const-string v0, "release"

    .line 78
    .line 79
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lio/sentry/q4;->f:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 85
    .line 86
    .line 87
    :cond_4
    iget-object v0, p0, Lio/sentry/q4;->i:Ljava/lang/String;

    .line 88
    .line 89
    if-eqz v0, :cond_5

    .line 90
    .line 91
    const-string v0, "environment"

    .line 92
    .line 93
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, Lio/sentry/q4;->i:Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 99
    .line 100
    .line 101
    :cond_5
    iget-object v0, p0, Lio/sentry/q4;->v:Ljava/lang/String;

    .line 102
    .line 103
    if-eqz v0, :cond_6

    .line 104
    .line 105
    const-string v0, "platform"

    .line 106
    .line 107
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 108
    .line 109
    .line 110
    iget-object v0, p0, Lio/sentry/q4;->v:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 113
    .line 114
    .line 115
    :cond_6
    iget-object v0, p0, Lio/sentry/q4;->w:Lio/sentry/protocol/j0;

    .line 116
    .line 117
    if-eqz v0, :cond_7

    .line 118
    .line 119
    const-string v0, "user"

    .line 120
    .line 121
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 122
    .line 123
    .line 124
    iget-object v0, p0, Lio/sentry/q4;->w:Lio/sentry/protocol/j0;

    .line 125
    .line 126
    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->v(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    .line 127
    .line 128
    .line 129
    :cond_7
    iget-object v0, p0, Lio/sentry/q4;->V:Ljava/lang/String;

    .line 130
    .line 131
    if-eqz v0, :cond_8

    .line 132
    .line 133
    const-string v0, "server_name"

    .line 134
    .line 135
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 136
    .line 137
    .line 138
    iget-object v0, p0, Lio/sentry/q4;->V:Ljava/lang/String;

    .line 139
    .line 140
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 141
    .line 142
    .line 143
    :cond_8
    iget-object v0, p0, Lio/sentry/q4;->W:Ljava/lang/String;

    .line 144
    .line 145
    if-eqz v0, :cond_9

    .line 146
    .line 147
    const-string v0, "dist"

    .line 148
    .line 149
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 150
    .line 151
    .line 152
    iget-object v0, p0, Lio/sentry/q4;->W:Ljava/lang/String;

    .line 153
    .line 154
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 155
    .line 156
    .line 157
    :cond_9
    iget-object v0, p0, Lio/sentry/q4;->X:Ljava/util/List;

    .line 158
    .line 159
    if-eqz v0, :cond_a

    .line 160
    .line 161
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-nez v0, :cond_a

    .line 166
    .line 167
    const-string v0, "breadcrumbs"

    .line 168
    .line 169
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 170
    .line 171
    .line 172
    iget-object v0, p0, Lio/sentry/q4;->X:Ljava/util/List;

    .line 173
    .line 174
    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->v(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    .line 175
    .line 176
    .line 177
    :cond_a
    iget-object v0, p0, Lio/sentry/q4;->Y:Lio/sentry/protocol/f;

    .line 178
    .line 179
    if-eqz v0, :cond_b

    .line 180
    .line 181
    const-string v0, "debug_meta"

    .line 182
    .line 183
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 184
    .line 185
    .line 186
    iget-object v0, p0, Lio/sentry/q4;->Y:Lio/sentry/protocol/f;

    .line 187
    .line 188
    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->v(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    .line 189
    .line 190
    .line 191
    :cond_b
    iget-object v0, p0, Lio/sentry/q4;->Z:Ljava/util/AbstractMap;

    .line 192
    .line 193
    if-eqz v0, :cond_c

    .line 194
    .line 195
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-nez v0, :cond_c

    .line 200
    .line 201
    const-string v0, "extra"

    .line 202
    .line 203
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 204
    .line 205
    .line 206
    iget-object p0, p0, Lio/sentry/q4;->Z:Ljava/util/AbstractMap;

    .line 207
    .line 208
    invoke-virtual {p1, p2, p0}, Lio/sentry/internal/debugmeta/c;->v(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    .line 209
    .line 210
    .line 211
    :cond_c
    return-void
.end method

.method public static final v(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/h;Lta;Lio/sentry/ILogger;Ljava/util/List;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lio/sentry/android/replay/viewhierarchy/b;->b(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/h;Lta;Lio/sentry/ILogger;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    check-cast p0, Landroid/view/ViewGroup;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    :goto_0
    return-void

    .line 28
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    const/4 v2, 0x0

    .line 42
    :goto_1
    if-ge v2, v1, :cond_5

    .line 43
    .line 44
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    if-eqz v3, :cond_4

    .line 49
    .line 50
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 51
    .line 52
    .line 53
    invoke-static {v3, p1, p2}, Lio/sentry/config/a;->i(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/h;Lta;)Lio/sentry/android/replay/viewhierarchy/h;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    if-eqz p4, :cond_3

    .line 61
    .line 62
    instance-of v5, v4, Lio/sentry/android/replay/viewhierarchy/f;

    .line 63
    .line 64
    if-eqz v5, :cond_3

    .line 65
    .line 66
    iget-boolean v5, v4, Lio/sentry/android/replay/viewhierarchy/h;->e:Z

    .line 67
    .line 68
    if-eqz v5, :cond_3

    .line 69
    .line 70
    invoke-interface {p4, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    :cond_3
    invoke-static {v3, v4, p2, p3, p4}, Lio/sentry/config/a;->v(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/h;Lta;Lio/sentry/ILogger;Ljava/util/List;)V

    .line 74
    .line 75
    .line 76
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_5
    iput-object v0, p1, Lio/sentry/android/replay/viewhierarchy/h;->g:Ljava/util/ArrayList;

    .line 80
    .line 81
    return-void
.end method


# virtual methods
.method public abstract p()I
.end method

.method public abstract s()Z
.end method
