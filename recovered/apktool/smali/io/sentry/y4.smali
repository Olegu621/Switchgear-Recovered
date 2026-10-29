.class public final synthetic Lio/sentry/y4;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Lio/sentry/i1;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/a;JLio/sentry/i1;Lio/sentry/ILogger;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lio/sentry/y4;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lio/sentry/y4;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iput-wide p2, p0, Lio/sentry/y4;->b:J

    .line 10
    .line 11
    iput-object p4, p0, Lio/sentry/y4;->c:Lio/sentry/i1;

    .line 12
    .line 13
    iput-object p5, p0, Lio/sentry/y4;->e:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/File;JLio/sentry/r3;Lio/sentry/i1;)V
    .locals 1

    .line 16
    const/4 v0, 0x1

    iput v0, p0, Lio/sentry/y4;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/y4;->d:Ljava/lang/Object;

    iput-wide p2, p0, Lio/sentry/y4;->b:J

    iput-object p4, p0, Lio/sentry/y4;->e:Ljava/lang/Object;

    iput-object p5, p0, Lio/sentry/y4;->c:Lio/sentry/i1;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lio/sentry/y4;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lio/sentry/y4;->c:Lio/sentry/i1;

    .line 5
    .line 6
    iget-object v3, p0, Lio/sentry/y4;->e:Ljava/lang/Object;

    .line 7
    .line 8
    iget-wide v4, p0, Lio/sentry/y4;->b:J

    .line 9
    .line 10
    iget-object p0, p0, Lio/sentry/y4;->d:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, Ljava/io/File;

    .line 16
    .line 17
    check-cast v3, Lio/sentry/r3;

    .line 18
    .line 19
    const-string v0, "Failed to serialize profiling trace data\n"

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    if-eqz v6, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-static {v6, v4, v5}, Lio/sentry/util/c;->o(Ljava/lang/String;J)[B

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    :try_start_0
    new-instance v5, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v4}, Lio/sentry/vendor/a;->b([B)[B

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    const-string v6, "US-ASCII"

    .line 42
    .line 43
    invoke-direct {v5, v4, v6}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_0

    .line 51
    .line 52
    iput-object v5, v3, Lio/sentry/r3;->m0:Ljava/lang/String;

    .line 53
    .line 54
    :try_start_1
    iget-object v1, v3, Lio/sentry/r3;->b:Ljava/util/concurrent/Callable;

    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Ljava/util/List;

    .line 61
    .line 62
    iput-object v1, v3, Lio/sentry/r3;->W:Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    .line 64
    :catchall_0
    :try_start_2
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 65
    .line 66
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 67
    .line 68
    .line 69
    :try_start_3
    new-instance v4, Ljava/io/BufferedWriter;

    .line 70
    .line 71
    new-instance v5, Ljava/io/OutputStreamWriter;

    .line 72
    .line 73
    sget-object v6, Lio/sentry/a5;->d:Ljava/nio/charset/Charset;

    .line 74
    .line 75
    invoke-direct {v5, v1, v6}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 76
    .line 77
    .line 78
    const/16 v6, 0x200

    .line 79
    .line 80
    invoke-direct {v4, v5, v6}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 81
    .line 82
    .line 83
    :try_start_4
    invoke-interface {v2, v4, v3}, Lio/sentry/i1;->a(Ljava/io/Writer;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 87
    .line 88
    .line 89
    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 90
    :try_start_5
    invoke-virtual {v4}, Ljava/io/Writer;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 91
    .line 92
    .line 93
    :try_start_6
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 97
    .line 98
    .line 99
    move-object v1, v2

    .line 100
    goto :goto_5

    .line 101
    :catchall_1
    move-exception v0

    .line 102
    goto :goto_4

    .line 103
    :catch_0
    move-exception v1

    .line 104
    goto :goto_3

    .line 105
    :catchall_2
    move-exception v2

    .line 106
    goto :goto_1

    .line 107
    :catchall_3
    move-exception v2

    .line 108
    :try_start_7
    invoke-virtual {v4}, Ljava/io/Writer;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :catchall_4
    move-exception v3

    .line 113
    :try_start_8
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    :goto_0
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 117
    :goto_1
    :try_start_9
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :catchall_5
    move-exception v1

    .line 122
    :try_start_a
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    :goto_2
    throw v2
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 126
    :goto_3
    :try_start_b
    new-instance v2, Lio/sentry/exception/c;

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    new-instance v3, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-direct {v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 148
    :goto_4
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 149
    .line 150
    .line 151
    throw v0

    .line 152
    :cond_0
    new-instance p0, Lio/sentry/exception/c;

    .line 153
    .line 154
    const-string v0, "Profiling trace file is empty"

    .line 155
    .line 156
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw p0

    .line 160
    :catch_1
    move-exception p0

    .line 161
    invoke-static {p0}, Ln4;->g(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    :goto_5
    return-object v1

    .line 165
    :cond_1
    new-instance v0, Lio/sentry/exception/c;

    .line 166
    .line 167
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    const-string v1, "Dropping profiling trace data, because the file \'"

    .line 172
    .line 173
    const-string v2, "\' doesn\'t exists"

    .line 174
    .line 175
    invoke-static {v1, p0, v2}, Lfm0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw v0

    .line 183
    :pswitch_0
    check-cast p0, Lio/sentry/a;

    .line 184
    .line 185
    check-cast v3, Lio/sentry/ILogger;

    .line 186
    .line 187
    iget-object v0, p0, Lio/sentry/a;->a:[B

    .line 188
    .line 189
    iget-object v6, p0, Lio/sentry/a;->e:Ljava/lang/String;

    .line 190
    .line 191
    if-eqz v0, :cond_2

    .line 192
    .line 193
    array-length p0, v0

    .line 194
    int-to-long v1, p0

    .line 195
    invoke-static {v6, v1, v2, v4, v5}, Lio/sentry/a5;->a(Ljava/lang/String;JJ)V

    .line 196
    .line 197
    .line 198
    goto/16 :goto_b

    .line 199
    .line 200
    :cond_2
    iget-object v0, p0, Lio/sentry/a;->b:Lio/sentry/protocol/k0;

    .line 201
    .line 202
    if-eqz v0, :cond_3

    .line 203
    .line 204
    sget-object p0, Lio/sentry/util/e;->a:Ljava/nio/charset/Charset;

    .line 205
    .line 206
    :try_start_c
    new-instance p0, Ljava/io/ByteArrayOutputStream;

    .line 207
    .line 208
    invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 209
    .line 210
    .line 211
    :try_start_d
    new-instance v7, Ljava/io/BufferedWriter;

    .line 212
    .line 213
    new-instance v8, Ljava/io/OutputStreamWriter;

    .line 214
    .line 215
    sget-object v9, Lio/sentry/util/e;->a:Ljava/nio/charset/Charset;

    .line 216
    .line 217
    invoke-direct {v8, p0, v9}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 218
    .line 219
    .line 220
    invoke-direct {v7, v8}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 221
    .line 222
    .line 223
    :try_start_e
    invoke-interface {v2, v7, v0}, Lio/sentry/i1;->a(Ljava/io/Writer;Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 227
    .line 228
    .line 229
    move-result-object v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 230
    :try_start_f
    invoke-virtual {v7}, Ljava/io/Writer;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 231
    .line 232
    .line 233
    :try_start_10
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    .line 234
    .line 235
    .line 236
    move-object v1, v0

    .line 237
    goto :goto_a

    .line 238
    :catchall_6
    move-exception p0

    .line 239
    goto :goto_9

    .line 240
    :catchall_7
    move-exception v0

    .line 241
    goto :goto_7

    .line 242
    :catchall_8
    move-exception v0

    .line 243
    :try_start_11
    invoke-virtual {v7}, Ljava/io/Writer;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    .line 244
    .line 245
    .line 246
    goto :goto_6

    .line 247
    :catchall_9
    move-exception v2

    .line 248
    :try_start_12
    invoke-virtual {v0, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 249
    .line 250
    .line 251
    :goto_6
    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    .line 252
    :goto_7
    :try_start_13
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_a

    .line 253
    .line 254
    .line 255
    goto :goto_8

    .line 256
    :catchall_a
    move-exception p0

    .line 257
    :try_start_14
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 258
    .line 259
    .line 260
    :goto_8
    throw v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_6

    .line 261
    :goto_9
    sget-object v0, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 262
    .line 263
    const-string v2, "Could not serialize serializable"

    .line 264
    .line 265
    invoke-interface {v3, v0, v2, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 266
    .line 267
    .line 268
    :goto_a
    if-eqz v1, :cond_5

    .line 269
    .line 270
    array-length p0, v1

    .line 271
    int-to-long v2, p0

    .line 272
    invoke-static {v6, v2, v3, v4, v5}, Lio/sentry/a5;->a(Ljava/lang/String;JJ)V

    .line 273
    .line 274
    .line 275
    move-object v0, v1

    .line 276
    goto :goto_b

    .line 277
    :cond_3
    iget-object v0, p0, Lio/sentry/a;->d:Ljava/lang/String;

    .line 278
    .line 279
    if-eqz v0, :cond_4

    .line 280
    .line 281
    invoke-static {v0, v4, v5}, Lio/sentry/util/c;->o(Ljava/lang/String;J)[B

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    goto :goto_b

    .line 286
    :cond_4
    iget-object p0, p0, Lio/sentry/a;->c:Lbh0;

    .line 287
    .line 288
    if-eqz p0, :cond_5

    .line 289
    .line 290
    invoke-virtual {p0}, Lbh0;->call()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    move-object v0, p0

    .line 295
    check-cast v0, [B

    .line 296
    .line 297
    if-eqz v0, :cond_5

    .line 298
    .line 299
    array-length p0, v0

    .line 300
    int-to-long v1, p0

    .line 301
    invoke-static {v6, v1, v2, v4, v5}, Lio/sentry/a5;->a(Ljava/lang/String;JJ)V

    .line 302
    .line 303
    .line 304
    :goto_b
    return-object v0

    .line 305
    :cond_5
    new-instance p0, Lio/sentry/exception/c;

    .line 306
    .line 307
    const-string v0, "Couldn\'t attach the attachment "

    .line 308
    .line 309
    const-string v1, ".\nPlease check that either bytes, serializable, path or provider is set."

    .line 310
    .line 311
    invoke-static {v0, v6, v1}, Lfm0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    throw p0

    .line 319
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
