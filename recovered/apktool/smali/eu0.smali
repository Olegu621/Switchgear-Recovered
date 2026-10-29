.class public final Leu0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/io/Serializable;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/util/Map;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lci3;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lyh3;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Leu0;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Leu0;->i:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {p2}, Lkb1;->k(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p3}, Lkb1;->n(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iput-object p3, p0, Leu0;->c:Ljava/lang/Object;

    .line 19
    .line 20
    iput-object p4, p0, Leu0;->d:Ljava/io/Serializable;

    .line 21
    .line 22
    iput-object p6, p0, Leu0;->e:Ljava/lang/Object;

    .line 23
    .line 24
    iput-object p2, p0, Leu0;->b:Ljava/lang/String;

    .line 25
    .line 26
    iput-object p5, p0, Leu0;->f:Ljava/util/Map;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Lrs0;Ljava/lang/String;Ljava/lang/String;Landroid/app/Application;Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Leu0;->a:I

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leu0;->c:Ljava/lang/Object;

    iput-object p2, p0, Leu0;->b:Ljava/lang/String;

    iput-object p3, p0, Leu0;->d:Ljava/io/Serializable;

    iput-object p4, p0, Leu0;->e:Ljava/lang/Object;

    iput-object p5, p0, Leu0;->f:Ljava/util/Map;

    iput-object p6, p0, Leu0;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lwl3;Ljava/lang/String;Ljava/net/URL;[BLjava/util/HashMap;Lul3;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Leu0;->a:I

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Leu0;->i:Ljava/lang/Object;

    .line 30
    invoke-static {p2}, Lkb1;->k(Ljava/lang/String;)V

    .line 31
    iput-object p3, p0, Leu0;->c:Ljava/lang/Object;

    iput-object p4, p0, Leu0;->d:Ljava/io/Serializable;

    iput-object p6, p0, Leu0;->e:Ljava/lang/Object;

    iput-object p2, p0, Leu0;->b:Ljava/lang/String;

    iput-object p5, p0, Leu0;->f:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(ILjava/io/IOException;[BLjava/util/Map;)V
    .locals 7

    .line 1
    iget-object v0, p0, Leu0;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lwl3;

    .line 4
    .line 5
    iget-object v0, v0, Lsq3;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lij3;

    .line 8
    .line 9
    iget-object v0, v0, Lij3;->i:Lbj3;

    .line 10
    .line 11
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lvl3;

    .line 15
    .line 16
    move-object v2, p0

    .line 17
    move v3, p1

    .line 18
    move-object v4, p2

    .line 19
    move-object v5, p3

    .line 20
    move-object v6, p4

    .line 21
    invoke-direct/range {v1 .. v6}, Lvl3;-><init>(Leu0;ILjava/lang/Exception;[BLjava/util/Map;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final run()V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Leu0;->a:I

    .line 4
    .line 5
    const-string v2, "Failed to obtain HTTP connection"

    .line 6
    .line 7
    const-string v4, "gzip"

    .line 8
    .line 9
    const-string v5, "Content-Encoding"

    .line 10
    .line 11
    const-string v6, "Uploading data. size"

    .line 12
    .line 13
    const v8, 0xea60

    .line 14
    .line 15
    .line 16
    const-string v9, "Error closing HTTP compressed POST connection output stream. appId"

    .line 17
    .line 18
    iget-object v10, v1, Leu0;->d:Ljava/io/Serializable;

    .line 19
    .line 20
    iget-object v11, v1, Leu0;->f:Ljava/util/Map;

    .line 21
    .line 22
    iget-object v12, v1, Leu0;->c:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v13, v1, Leu0;->i:Ljava/lang/Object;

    .line 25
    .line 26
    const/4 v15, 0x0

    .line 27
    iget-object v14, v1, Leu0;->b:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v3, v1, Leu0;->e:Ljava/lang/Object;

    .line 30
    .line 31
    const/4 v7, 0x1

    .line 32
    packed-switch v0, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    check-cast v13, Lwl3;

    .line 36
    .line 37
    iget-object v0, v13, Lsq3;->a:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Lij3;

    .line 40
    .line 41
    iget-object v3, v13, Lsq3;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, Lij3;

    .line 44
    .line 45
    iget-object v0, v0, Lij3;->i:Lbj3;

    .line 46
    .line 47
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lbj3;->D()V

    .line 51
    .line 52
    .line 53
    :try_start_0
    check-cast v12, Ljava/net/URL;

    .line 54
    .line 55
    invoke-virtual {v12}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    instance-of v12, v0, Ljava/net/HttpURLConnection;

    .line 60
    .line 61
    if-eqz v12, :cond_4

    .line 62
    .line 63
    move-object v2, v0

    .line 64
    check-cast v2, Ljava/net/HttpURLConnection;

    .line 65
    .line 66
    invoke-virtual {v2, v15}, Ljava/net/URLConnection;->setDefaultUseCaches(Z)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v8}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 73
    .line 74
    .line 75
    const v0, 0xee48

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v15}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v7}, Ljava/net/URLConnection;->setDoInput(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 85
    .line 86
    .line 87
    if-eqz v11, :cond_0

    .line 88
    .line 89
    :try_start_1
    invoke-interface {v11}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    if-eqz v8, :cond_0

    .line 102
    .line 103
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    check-cast v8, Ljava/util/Map$Entry;

    .line 108
    .line 109
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v11

    .line 113
    check-cast v11, Ljava/lang/String;

    .line 114
    .line 115
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    check-cast v8, Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v2, v11, v8}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :catchall_0
    move-exception v0

    .line 126
    goto/16 :goto_e

    .line 127
    .line 128
    :catch_0
    move-exception v0

    .line 129
    goto/16 :goto_f

    .line 130
    .line 131
    :cond_0
    check-cast v10, [B
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 132
    .line 133
    if-eqz v10, :cond_1

    .line 134
    .line 135
    :try_start_2
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 136
    .line 137
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 138
    .line 139
    .line 140
    new-instance v8, Ljava/util/zip/GZIPOutputStream;

    .line 141
    .line 142
    invoke-direct {v8, v0}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v8, v10}, Ljava/io/OutputStream;->write([B)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v8}, Ljava/io/OutputStream;->close()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 155
    .line 156
    .line 157
    move-result-object v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 158
    :try_start_3
    iget-object v8, v3, Lij3;->f:Luh3;

    .line 159
    .line 160
    invoke-static {v8}, Lij3;->l(Lhk3;)V

    .line 161
    .line 162
    .line 163
    iget-object v8, v8, Luh3;->Y:Lsh3;

    .line 164
    .line 165
    array-length v10, v0

    .line 166
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 167
    .line 168
    .line 169
    move-result-object v11

    .line 170
    invoke-virtual {v8, v11, v6}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v7}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2, v5, v4}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v10}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2}, Ljava/net/URLConnection;->connect()V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 186
    .line 187
    .line 188
    move-result-object v4
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 189
    :try_start_4
    invoke-virtual {v4, v0}, Ljava/io/OutputStream;->write([B)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 193
    .line 194
    .line 195
    goto :goto_7

    .line 196
    :catchall_1
    move-exception v0

    .line 197
    goto :goto_1

    .line 198
    :catch_1
    move-exception v0

    .line 199
    goto :goto_4

    .line 200
    :goto_1
    move-object v5, v2

    .line 201
    :goto_2
    const/4 v6, 0x0

    .line 202
    :goto_3
    move-object v2, v0

    .line 203
    goto/16 :goto_11

    .line 204
    .line 205
    :goto_4
    move-object v5, v2

    .line 206
    :goto_5
    const/4 v6, 0x0

    .line 207
    :goto_6
    move-object v2, v0

    .line 208
    goto/16 :goto_14

    .line 209
    .line 210
    :catch_2
    move-exception v0

    .line 211
    :try_start_5
    iget-object v4, v3, Lij3;->f:Luh3;

    .line 212
    .line 213
    invoke-static {v4}, Lij3;->l(Lhk3;)V

    .line 214
    .line 215
    .line 216
    iget-object v4, v4, Luh3;->f:Lsh3;

    .line 217
    .line 218
    const-string v5, "Failed to gzip post request content"

    .line 219
    .line 220
    invoke-virtual {v4, v0, v5}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    throw v0

    .line 224
    :cond_1
    :goto_7
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 225
    .line 226
    .line 227
    move-result v4
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 228
    :try_start_6
    invoke-virtual {v2}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 229
    .line 230
    .line 231
    move-result-object v5
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 232
    :try_start_7
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 233
    .line 234
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 238
    .line 239
    .line 240
    move-result-object v6
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 241
    const/16 v7, 0x400

    .line 242
    .line 243
    :try_start_8
    new-array v7, v7, [B

    .line 244
    .line 245
    :goto_8
    invoke-virtual {v6, v7}, Ljava/io/InputStream;->read([B)I

    .line 246
    .line 247
    .line 248
    move-result v8

    .line 249
    if-lez v8, :cond_2

    .line 250
    .line 251
    invoke-virtual {v0, v7, v15, v8}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 252
    .line 253
    .line 254
    goto :goto_8

    .line 255
    :catchall_2
    move-exception v0

    .line 256
    goto :goto_9

    .line 257
    :cond_2
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 258
    .line 259
    .line 260
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 261
    :try_start_9
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_3
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 265
    .line 266
    .line 267
    const/4 v2, 0x0

    .line 268
    invoke-virtual {v1, v4, v2, v0, v5}, Leu0;->a(ILjava/io/IOException;[BLjava/util/Map;)V

    .line 269
    .line 270
    .line 271
    goto/16 :goto_16

    .line 272
    .line 273
    :catchall_3
    move-exception v0

    .line 274
    goto :goto_a

    .line 275
    :catch_3
    move-exception v0

    .line 276
    goto :goto_b

    .line 277
    :catchall_4
    move-exception v0

    .line 278
    const/4 v6, 0x0

    .line 279
    :goto_9
    if-eqz v6, :cond_3

    .line 280
    .line 281
    :try_start_a
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 282
    .line 283
    .line 284
    :cond_3
    throw v0
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_3
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 285
    :goto_a
    move v15, v4

    .line 286
    move-object v6, v5

    .line 287
    const/4 v4, 0x0

    .line 288
    move-object v5, v2

    .line 289
    goto :goto_3

    .line 290
    :goto_b
    move v15, v4

    .line 291
    move-object v6, v5

    .line 292
    const/4 v4, 0x0

    .line 293
    move-object v5, v2

    .line 294
    goto :goto_6

    .line 295
    :catchall_5
    move-exception v0

    .line 296
    move-object v5, v2

    .line 297
    move v15, v4

    .line 298
    :goto_c
    const/4 v4, 0x0

    .line 299
    goto :goto_2

    .line 300
    :catch_4
    move-exception v0

    .line 301
    move-object v5, v2

    .line 302
    move v15, v4

    .line 303
    :goto_d
    const/4 v4, 0x0

    .line 304
    goto :goto_5

    .line 305
    :goto_e
    move-object v5, v2

    .line 306
    goto :goto_c

    .line 307
    :goto_f
    move-object v5, v2

    .line 308
    goto :goto_d

    .line 309
    :catchall_6
    move-exception v0

    .line 310
    goto :goto_10

    .line 311
    :catch_5
    move-exception v0

    .line 312
    goto :goto_13

    .line 313
    :cond_4
    :try_start_b
    new-instance v0, Ljava/io/IOException;

    .line 314
    .line 315
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    throw v0
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_5
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 319
    :goto_10
    move-object v2, v0

    .line 320
    const/4 v4, 0x0

    .line 321
    const/4 v5, 0x0

    .line 322
    const/4 v6, 0x0

    .line 323
    :goto_11
    if-eqz v4, :cond_5

    .line 324
    .line 325
    :try_start_c
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_6

    .line 326
    .line 327
    .line 328
    goto :goto_12

    .line 329
    :catch_6
    move-exception v0

    .line 330
    iget-object v3, v3, Lij3;->f:Luh3;

    .line 331
    .line 332
    invoke-static {v3}, Lij3;->l(Lhk3;)V

    .line 333
    .line 334
    .line 335
    iget-object v3, v3, Luh3;->f:Lsh3;

    .line 336
    .line 337
    invoke-static {v14}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 338
    .line 339
    .line 340
    move-result-object v4

    .line 341
    invoke-virtual {v3, v4, v9, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    :cond_5
    :goto_12
    if-eqz v5, :cond_6

    .line 345
    .line 346
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 347
    .line 348
    .line 349
    :cond_6
    const/4 v3, 0x0

    .line 350
    invoke-virtual {v1, v15, v3, v3, v6}, Leu0;->a(ILjava/io/IOException;[BLjava/util/Map;)V

    .line 351
    .line 352
    .line 353
    throw v2

    .line 354
    :goto_13
    move-object v2, v0

    .line 355
    const/4 v4, 0x0

    .line 356
    const/4 v5, 0x0

    .line 357
    const/4 v6, 0x0

    .line 358
    :goto_14
    if-eqz v4, :cond_7

    .line 359
    .line 360
    :try_start_d
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_7

    .line 361
    .line 362
    .line 363
    goto :goto_15

    .line 364
    :catch_7
    move-exception v0

    .line 365
    iget-object v3, v3, Lij3;->f:Luh3;

    .line 366
    .line 367
    invoke-static {v3}, Lij3;->l(Lhk3;)V

    .line 368
    .line 369
    .line 370
    iget-object v3, v3, Luh3;->f:Lsh3;

    .line 371
    .line 372
    invoke-static {v14}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 373
    .line 374
    .line 375
    move-result-object v4

    .line 376
    invoke-virtual {v3, v4, v9, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    :cond_7
    :goto_15
    if-eqz v5, :cond_8

    .line 380
    .line 381
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 382
    .line 383
    .line 384
    :cond_8
    const/4 v3, 0x0

    .line 385
    invoke-virtual {v1, v15, v2, v3, v6}, Leu0;->a(ILjava/io/IOException;[BLjava/util/Map;)V

    .line 386
    .line 387
    .line 388
    :goto_16
    return-void

    .line 389
    :pswitch_0
    check-cast v13, Lci3;

    .line 390
    .line 391
    iget-object v0, v13, Lsq3;->a:Ljava/lang/Object;

    .line 392
    .line 393
    check-cast v0, Lij3;

    .line 394
    .line 395
    iget-object v7, v13, Lsq3;->a:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast v7, Lij3;

    .line 398
    .line 399
    iget-object v0, v0, Lij3;->i:Lbj3;

    .line 400
    .line 401
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v0}, Lbj3;->D()V

    .line 405
    .line 406
    .line 407
    :try_start_e
    check-cast v12, Ljava/net/URL;

    .line 408
    .line 409
    invoke-virtual {v12}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    instance-of v12, v0, Ljava/net/HttpURLConnection;

    .line 414
    .line 415
    if-eqz v12, :cond_d

    .line 416
    .line 417
    move-object v2, v0

    .line 418
    check-cast v2, Ljava/net/HttpURLConnection;

    .line 419
    .line 420
    invoke-virtual {v2, v15}, Ljava/net/URLConnection;->setDefaultUseCaches(Z)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v2, v8}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 427
    .line 428
    .line 429
    const v0, 0xee48

    .line 430
    .line 431
    .line 432
    invoke-virtual {v2, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v2, v15}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 436
    .line 437
    .line 438
    const/4 v0, 0x1

    .line 439
    invoke-virtual {v2, v0}, Ljava/net/URLConnection;->setDoInput(Z)V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_c
    .catchall {:try_start_e .. :try_end_e} :catchall_d

    .line 440
    .line 441
    .line 442
    if-eqz v11, :cond_9

    .line 443
    .line 444
    :try_start_f
    invoke-interface {v11}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 453
    .line 454
    .line 455
    move-result v8

    .line 456
    if-eqz v8, :cond_9

    .line 457
    .line 458
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v8

    .line 462
    check-cast v8, Ljava/util/Map$Entry;

    .line 463
    .line 464
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v11

    .line 468
    check-cast v11, Ljava/lang/String;

    .line 469
    .line 470
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v8

    .line 474
    check-cast v8, Ljava/lang/String;

    .line 475
    .line 476
    invoke-virtual {v2, v11, v8}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    goto :goto_17

    .line 480
    :catchall_7
    move-exception v0

    .line 481
    goto/16 :goto_24

    .line 482
    .line 483
    :catch_8
    move-exception v0

    .line 484
    goto/16 :goto_25

    .line 485
    .line 486
    :cond_9
    check-cast v10, [B

    .line 487
    .line 488
    if-eqz v10, :cond_a

    .line 489
    .line 490
    iget-object v0, v13, Lqo3;->b:Lmp3;

    .line 491
    .line 492
    iget-object v0, v0, Lmp3;->i:Lci3;

    .line 493
    .line 494
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v0, v10}, Lci3;->l0([B)[B

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    iget-object v8, v7, Lij3;->f:Luh3;

    .line 502
    .line 503
    invoke-static {v8}, Lij3;->l(Lhk3;)V

    .line 504
    .line 505
    .line 506
    iget-object v8, v8, Luh3;->Y:Lsh3;

    .line 507
    .line 508
    array-length v10, v0

    .line 509
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 510
    .line 511
    .line 512
    move-result-object v11

    .line 513
    invoke-virtual {v8, v11, v6}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    const/4 v6, 0x1

    .line 517
    invoke-virtual {v2, v6}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 518
    .line 519
    .line 520
    invoke-virtual {v2, v5, v4}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v2, v10}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 524
    .line 525
    .line 526
    invoke-virtual {v2}, Ljava/net/URLConnection;->connect()V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v2}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 530
    .line 531
    .line 532
    move-result-object v4
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_8
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 533
    :try_start_10
    invoke-virtual {v4, v0}, Ljava/io/OutputStream;->write([B)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_9
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    .line 537
    .line 538
    .line 539
    goto :goto_1c

    .line 540
    :catchall_8
    move-exception v0

    .line 541
    goto :goto_18

    .line 542
    :catch_9
    move-exception v0

    .line 543
    goto :goto_1a

    .line 544
    :goto_18
    move-object/from16 v16, v4

    .line 545
    .line 546
    move/from16 v20, v15

    .line 547
    .line 548
    const/16 v23, 0x0

    .line 549
    .line 550
    move-object v4, v2

    .line 551
    :goto_19
    move-object v2, v0

    .line 552
    goto/16 :goto_27

    .line 553
    .line 554
    :goto_1a
    move-object/from16 v21, v0

    .line 555
    .line 556
    move-object/from16 v16, v4

    .line 557
    .line 558
    move/from16 v20, v15

    .line 559
    .line 560
    :goto_1b
    const/16 v23, 0x0

    .line 561
    .line 562
    goto/16 :goto_2a

    .line 563
    .line 564
    :cond_a
    :goto_1c
    :try_start_11
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 565
    .line 566
    .line 567
    move-result v20
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_8
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 568
    :try_start_12
    invoke-virtual {v2}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 569
    .line 570
    .line 571
    move-result-object v23
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_b
    .catchall {:try_start_12 .. :try_end_12} :catchall_c

    .line 572
    :try_start_13
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 573
    .line 574
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 575
    .line 576
    .line 577
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 578
    .line 579
    .line 580
    move-result-object v4
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_b

    .line 581
    const/16 v5, 0x400

    .line 582
    .line 583
    :try_start_14
    new-array v5, v5, [B

    .line 584
    .line 585
    :goto_1d
    invoke-virtual {v4, v5}, Ljava/io/InputStream;->read([B)I

    .line 586
    .line 587
    .line 588
    move-result v6

    .line 589
    if-lez v6, :cond_b

    .line 590
    .line 591
    invoke-virtual {v0, v5, v15, v6}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 592
    .line 593
    .line 594
    goto :goto_1d

    .line 595
    :catchall_9
    move-exception v0

    .line 596
    goto :goto_1f

    .line 597
    :cond_b
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 598
    .line 599
    .line 600
    move-result-object v22
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_9

    .line 601
    :try_start_15
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_15
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_a
    .catchall {:try_start_15 .. :try_end_15} :catchall_a

    .line 602
    .line 603
    .line 604
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 605
    .line 606
    .line 607
    move-object/from16 v19, v3

    .line 608
    .line 609
    check-cast v19, Lyh3;

    .line 610
    .line 611
    iget-object v0, v7, Lij3;->i:Lbj3;

    .line 612
    .line 613
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 614
    .line 615
    .line 616
    new-instance v17, Lqh3;

    .line 617
    .line 618
    const/16 v21, 0x0

    .line 619
    .line 620
    iget-object v1, v1, Leu0;->b:Ljava/lang/String;

    .line 621
    .line 622
    move-object/from16 v18, v1

    .line 623
    .line 624
    invoke-direct/range {v17 .. v23}, Lqh3;-><init>(Ljava/lang/String;Lyh3;ILjava/io/IOException;[BLjava/util/Map;)V

    .line 625
    .line 626
    .line 627
    :goto_1e
    move-object/from16 v1, v17

    .line 628
    .line 629
    invoke-virtual {v0, v1}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 630
    .line 631
    .line 632
    goto/16 :goto_2c

    .line 633
    .line 634
    :catchall_a
    move-exception v0

    .line 635
    goto :goto_20

    .line 636
    :catch_a
    move-exception v0

    .line 637
    goto :goto_21

    .line 638
    :catchall_b
    move-exception v0

    .line 639
    const/4 v4, 0x0

    .line 640
    :goto_1f
    if-eqz v4, :cond_c

    .line 641
    .line 642
    :try_start_16
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V

    .line 643
    .line 644
    .line 645
    :cond_c
    throw v0
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_a
    .catchall {:try_start_16 .. :try_end_16} :catchall_a

    .line 646
    :goto_20
    move-object v4, v2

    .line 647
    const/16 v16, 0x0

    .line 648
    .line 649
    goto :goto_19

    .line 650
    :goto_21
    move-object/from16 v21, v0

    .line 651
    .line 652
    const/16 v16, 0x0

    .line 653
    .line 654
    goto/16 :goto_2a

    .line 655
    .line 656
    :catchall_c
    move-exception v0

    .line 657
    move-object v4, v2

    .line 658
    :goto_22
    const/16 v16, 0x0

    .line 659
    .line 660
    const/16 v23, 0x0

    .line 661
    .line 662
    goto :goto_19

    .line 663
    :catch_b
    move-exception v0

    .line 664
    move-object/from16 v21, v0

    .line 665
    .line 666
    :goto_23
    const/16 v16, 0x0

    .line 667
    .line 668
    goto :goto_1b

    .line 669
    :goto_24
    move-object v4, v2

    .line 670
    move/from16 v20, v15

    .line 671
    .line 672
    goto :goto_22

    .line 673
    :goto_25
    move-object/from16 v21, v0

    .line 674
    .line 675
    move/from16 v20, v15

    .line 676
    .line 677
    goto :goto_23

    .line 678
    :catchall_d
    move-exception v0

    .line 679
    goto :goto_26

    .line 680
    :catch_c
    move-exception v0

    .line 681
    goto :goto_29

    .line 682
    :cond_d
    :try_start_17
    new-instance v0, Ljava/io/IOException;

    .line 683
    .line 684
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 685
    .line 686
    .line 687
    throw v0
    :try_end_17
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_17} :catch_c
    .catchall {:try_start_17 .. :try_end_17} :catchall_d

    .line 688
    :goto_26
    move-object v2, v0

    .line 689
    move/from16 v20, v15

    .line 690
    .line 691
    const/4 v4, 0x0

    .line 692
    const/16 v16, 0x0

    .line 693
    .line 694
    const/16 v23, 0x0

    .line 695
    .line 696
    :goto_27
    if-eqz v16, :cond_e

    .line 697
    .line 698
    :try_start_18
    invoke-virtual/range {v16 .. v16}, Ljava/io/OutputStream;->close()V
    :try_end_18
    .catch Ljava/io/IOException; {:try_start_18 .. :try_end_18} :catch_d

    .line 699
    .line 700
    .line 701
    goto :goto_28

    .line 702
    :catch_d
    move-exception v0

    .line 703
    iget-object v5, v7, Lij3;->f:Luh3;

    .line 704
    .line 705
    invoke-static {v5}, Lij3;->l(Lhk3;)V

    .line 706
    .line 707
    .line 708
    iget-object v5, v5, Luh3;->f:Lsh3;

    .line 709
    .line 710
    invoke-static {v14}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 711
    .line 712
    .line 713
    move-result-object v6

    .line 714
    invoke-virtual {v5, v6, v9, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 715
    .line 716
    .line 717
    :cond_e
    :goto_28
    if-eqz v4, :cond_f

    .line 718
    .line 719
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 720
    .line 721
    .line 722
    :cond_f
    move-object/from16 v19, v3

    .line 723
    .line 724
    check-cast v19, Lyh3;

    .line 725
    .line 726
    iget-object v0, v7, Lij3;->i:Lbj3;

    .line 727
    .line 728
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 729
    .line 730
    .line 731
    new-instance v17, Lqh3;

    .line 732
    .line 733
    const/16 v21, 0x0

    .line 734
    .line 735
    const/16 v22, 0x0

    .line 736
    .line 737
    iget-object v1, v1, Leu0;->b:Ljava/lang/String;

    .line 738
    .line 739
    move-object/from16 v18, v1

    .line 740
    .line 741
    invoke-direct/range {v17 .. v23}, Lqh3;-><init>(Ljava/lang/String;Lyh3;ILjava/io/IOException;[BLjava/util/Map;)V

    .line 742
    .line 743
    .line 744
    move-object/from16 v1, v17

    .line 745
    .line 746
    invoke-virtual {v0, v1}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 747
    .line 748
    .line 749
    throw v2

    .line 750
    :goto_29
    move-object/from16 v21, v0

    .line 751
    .line 752
    move/from16 v20, v15

    .line 753
    .line 754
    const/4 v2, 0x0

    .line 755
    goto :goto_23

    .line 756
    :goto_2a
    if-eqz v16, :cond_10

    .line 757
    .line 758
    :try_start_19
    invoke-virtual/range {v16 .. v16}, Ljava/io/OutputStream;->close()V
    :try_end_19
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_19} :catch_e

    .line 759
    .line 760
    .line 761
    goto :goto_2b

    .line 762
    :catch_e
    move-exception v0

    .line 763
    iget-object v4, v7, Lij3;->f:Luh3;

    .line 764
    .line 765
    invoke-static {v4}, Lij3;->l(Lhk3;)V

    .line 766
    .line 767
    .line 768
    iget-object v4, v4, Luh3;->f:Lsh3;

    .line 769
    .line 770
    invoke-static {v14}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 771
    .line 772
    .line 773
    move-result-object v5

    .line 774
    invoke-virtual {v4, v5, v9, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 775
    .line 776
    .line 777
    :cond_10
    :goto_2b
    if-eqz v2, :cond_11

    .line 778
    .line 779
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 780
    .line 781
    .line 782
    :cond_11
    move-object/from16 v19, v3

    .line 783
    .line 784
    check-cast v19, Lyh3;

    .line 785
    .line 786
    iget-object v0, v7, Lij3;->i:Lbj3;

    .line 787
    .line 788
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 789
    .line 790
    .line 791
    new-instance v17, Lqh3;

    .line 792
    .line 793
    const/16 v22, 0x0

    .line 794
    .line 795
    iget-object v1, v1, Leu0;->b:Ljava/lang/String;

    .line 796
    .line 797
    move-object/from16 v18, v1

    .line 798
    .line 799
    invoke-direct/range {v17 .. v23}, Lqh3;-><init>(Ljava/lang/String;Lyh3;ILjava/io/IOException;[BLjava/util/Map;)V

    .line 800
    .line 801
    .line 802
    goto/16 :goto_1e

    .line 803
    .line 804
    :goto_2c
    return-void

    .line 805
    :pswitch_1
    check-cast v11, Ljava/util/HashMap;

    .line 806
    .line 807
    check-cast v12, Lrs0;

    .line 808
    .line 809
    iget-object v0, v12, Lrs0;->e:Liy;

    .line 810
    .line 811
    iget-object v1, v12, Lrs0;->n:Ler0;

    .line 812
    .line 813
    check-cast v10, Ljava/lang/String;

    .line 814
    .line 815
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 816
    .line 817
    .line 818
    const-string v2, "\\."

    .line 819
    .line 820
    const/4 v4, 0x2

    .line 821
    invoke-virtual {v10, v2, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 822
    .line 823
    .line 824
    move-result-object v2

    .line 825
    iget-object v0, v0, Liy;->a:Ljava/lang/Object;

    .line 826
    .line 827
    check-cast v0, Ler0;

    .line 828
    .line 829
    aget-object v5, v2, v15

    .line 830
    .line 831
    const-string v6, "domain"

    .line 832
    .line 833
    invoke-virtual {v0, v6, v5}, Ler0;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 834
    .line 835
    .line 836
    const/16 v19, 0x1

    .line 837
    .line 838
    aget-object v2, v2, v19

    .line 839
    .line 840
    const-string v5, "host"

    .line 841
    .line 842
    invoke-virtual {v0, v5, v2}, Ler0;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 843
    .line 844
    .line 845
    const-string v2, "platform_id"

    .line 846
    .line 847
    invoke-virtual {v0, v2, v14}, Ler0;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 848
    .line 849
    .line 850
    check-cast v3, Landroid/app/Application;

    .line 851
    .line 852
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 853
    .line 854
    .line 855
    move-result-object v0

    .line 856
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 857
    .line 858
    and-int/2addr v0, v4

    .line 859
    if-eqz v0, :cond_12

    .line 860
    .line 861
    const/4 v0, 0x1

    .line 862
    goto :goto_2d

    .line 863
    :cond_12
    move v0, v15

    .line 864
    :goto_2d
    const-string v2, "enableLogging"

    .line 865
    .line 866
    invoke-virtual {v11, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 867
    .line 868
    .line 869
    move-result-object v2

    .line 870
    instance-of v4, v2, Ljava/lang/Boolean;

    .line 871
    .line 872
    if-eqz v4, :cond_13

    .line 873
    .line 874
    check-cast v2, Ljava/lang/Boolean;

    .line 875
    .line 876
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 877
    .line 878
    .line 879
    move-result v2

    .line 880
    if-eqz v2, :cond_13

    .line 881
    .line 882
    const/4 v2, 0x1

    .line 883
    goto :goto_2e

    .line 884
    :cond_13
    move v2, v15

    .line 885
    :goto_2e
    iput-boolean v2, v12, Lrs0;->d:Z

    .line 886
    .line 887
    new-instance v4, Lzr3;

    .line 888
    .line 889
    invoke-direct {v4, v0, v2}, Lzr3;-><init>(ZZ)V

    .line 890
    .line 891
    .line 892
    const-string v5, ""

    .line 893
    .line 894
    if-eqz v0, :cond_14

    .line 895
    .line 896
    if-eqz v2, :cond_14

    .line 897
    .line 898
    new-instance v0, Laa1;

    .line 899
    .line 900
    new-instance v2, Ljava/lang/StringBuilder;

    .line 901
    .line 902
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 903
    .line 904
    .line 905
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 906
    .line 907
    .line 908
    move-result-wide v6

    .line 909
    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 910
    .line 911
    .line 912
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 913
    .line 914
    .line 915
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 916
    .line 917
    .line 918
    move-result-object v2

    .line 919
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 920
    .line 921
    .line 922
    move-result-object v6

    .line 923
    invoke-virtual {v6}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 924
    .line 925
    .line 926
    move-result-object v6

    .line 927
    invoke-virtual {v6}, Ljava/lang/Thread;->getId()J

    .line 928
    .line 929
    .line 930
    move-result-wide v6

    .line 931
    invoke-direct {v0, v3, v2, v6, v7}, Laa1;-><init>(Landroid/content/Context;Ljava/lang/String;J)V

    .line 932
    .line 933
    .line 934
    iput-object v0, v4, Lzr3;->c:Ljava/lang/Object;

    .line 935
    .line 936
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 937
    .line 938
    .line 939
    move-result-object v0

    .line 940
    new-instance v2, Lit0;

    .line 941
    .line 942
    invoke-direct {v2, v0}, Lit0;-><init>(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 943
    .line 944
    .line 945
    invoke-static {v2}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 946
    .line 947
    .line 948
    iget-object v0, v12, Lrs0;->h:Lb5;

    .line 949
    .line 950
    iget-object v2, v0, Lb5;->f:Ljava/lang/Object;

    .line 951
    .line 952
    check-cast v2, Lra2;

    .line 953
    .line 954
    new-instance v6, Ldt0;

    .line 955
    .line 956
    const/4 v7, 0x1

    .line 957
    invoke-direct {v6, v0, v7}, Ldt0;-><init>(Lb5;I)V

    .line 958
    .line 959
    .line 960
    invoke-virtual {v2, v6}, Lra2;->t(Ljava/lang/Runnable;)V

    .line 961
    .line 962
    .line 963
    goto :goto_2f

    .line 964
    :cond_14
    const/4 v7, 0x1

    .line 965
    :goto_2f
    sput-object v4, Lxe2;->h:Lzr3;

    .line 966
    .line 967
    const-string v0, "Install called: Domain : "

    .line 968
    .line 969
    const-string v2, ", Config: "

    .line 970
    .line 971
    invoke-static {v0, v10, v2}, Len;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 972
    .line 973
    .line 974
    move-result-object v0

    .line 975
    check-cast v13, Ljava/util/HashMap;

    .line 976
    .line 977
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 978
    .line 979
    .line 980
    const-string v2, " SDK X Version: 10.2.0"

    .line 981
    .line 982
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 983
    .line 984
    .line 985
    iget-object v2, v12, Lrs0;->r:Lcb;

    .line 986
    .line 987
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 988
    .line 989
    .line 990
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 991
    .line 992
    .line 993
    move-result-object v0

    .line 994
    const-string v2, "Helpshift"

    .line 995
    .line 996
    const/4 v4, 0x0

    .line 997
    invoke-static {v2, v0, v4}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 998
    .line 999
    .line 1000
    iget-object v0, v12, Lrs0;->h:Lb5;

    .line 1001
    .line 1002
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v2

    .line 1006
    const-string v4, "notificationChannelId"

    .line 1007
    .line 1008
    invoke-virtual {v11, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v6

    .line 1012
    instance-of v8, v6, Ljava/lang/String;

    .line 1013
    .line 1014
    if-eqz v8, :cond_15

    .line 1015
    .line 1016
    check-cast v6, Ljava/lang/String;

    .line 1017
    .line 1018
    iget-object v8, v0, Lb5;->d:Ljava/lang/Object;

    .line 1019
    .line 1020
    check-cast v8, Ler0;

    .line 1021
    .line 1022
    invoke-virtual {v8, v4, v6}, Ler0;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 1023
    .line 1024
    .line 1025
    :cond_15
    const-string v4, "notificationSoundId"

    .line 1026
    .line 1027
    invoke-virtual {v11, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v6

    .line 1031
    instance-of v8, v6, Ljava/lang/Integer;

    .line 1032
    .line 1033
    if-eqz v8, :cond_16

    .line 1034
    .line 1035
    check-cast v6, Ljava/lang/Integer;

    .line 1036
    .line 1037
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 1038
    .line 1039
    .line 1040
    move-result v6

    .line 1041
    iget-object v8, v0, Lb5;->d:Ljava/lang/Object;

    .line 1042
    .line 1043
    check-cast v8, Ler0;

    .line 1044
    .line 1045
    invoke-virtual {v8, v6, v4}, Ler0;->x(ILjava/lang/String;)V

    .line 1046
    .line 1047
    .line 1048
    goto :goto_30

    .line 1049
    :cond_16
    instance-of v8, v6, Ljava/lang/String;

    .line 1050
    .line 1051
    if-eqz v8, :cond_17

    .line 1052
    .line 1053
    check-cast v6, Ljava/lang/String;

    .line 1054
    .line 1055
    const-string v8, "raw"

    .line 1056
    .line 1057
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v9

    .line 1061
    invoke-virtual {v9, v6, v8, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 1062
    .line 1063
    .line 1064
    move-result v6

    .line 1065
    iget-object v8, v0, Lb5;->d:Ljava/lang/Object;

    .line 1066
    .line 1067
    check-cast v8, Ler0;

    .line 1068
    .line 1069
    invoke-virtual {v8, v6, v4}, Ler0;->x(ILjava/lang/String;)V

    .line 1070
    .line 1071
    .line 1072
    :cond_17
    :goto_30
    const-string v4, "notificationIcon"

    .line 1073
    .line 1074
    invoke-virtual {v11, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v6

    .line 1078
    instance-of v8, v6, Ljava/lang/Integer;

    .line 1079
    .line 1080
    const-string v9, "drawable"

    .line 1081
    .line 1082
    if-eqz v8, :cond_18

    .line 1083
    .line 1084
    check-cast v6, Ljava/lang/Integer;

    .line 1085
    .line 1086
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 1087
    .line 1088
    .line 1089
    move-result v6

    .line 1090
    iget-object v8, v0, Lb5;->d:Ljava/lang/Object;

    .line 1091
    .line 1092
    check-cast v8, Ler0;

    .line 1093
    .line 1094
    invoke-virtual {v8, v6, v4}, Ler0;->x(ILjava/lang/String;)V

    .line 1095
    .line 1096
    .line 1097
    goto :goto_31

    .line 1098
    :cond_18
    instance-of v8, v6, Ljava/lang/String;

    .line 1099
    .line 1100
    if-eqz v8, :cond_19

    .line 1101
    .line 1102
    check-cast v6, Ljava/lang/String;

    .line 1103
    .line 1104
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v8

    .line 1108
    invoke-virtual {v8, v6, v9, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 1109
    .line 1110
    .line 1111
    move-result v6

    .line 1112
    iget-object v8, v0, Lb5;->d:Ljava/lang/Object;

    .line 1113
    .line 1114
    check-cast v8, Ler0;

    .line 1115
    .line 1116
    invoke-virtual {v8, v6, v4}, Ler0;->x(ILjava/lang/String;)V

    .line 1117
    .line 1118
    .line 1119
    :cond_19
    :goto_31
    const-string v4, "notificationLargeIcon"

    .line 1120
    .line 1121
    invoke-virtual {v11, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v6

    .line 1125
    instance-of v8, v6, Ljava/lang/Integer;

    .line 1126
    .line 1127
    if-eqz v8, :cond_1a

    .line 1128
    .line 1129
    check-cast v6, Ljava/lang/Integer;

    .line 1130
    .line 1131
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 1132
    .line 1133
    .line 1134
    move-result v2

    .line 1135
    iget-object v0, v0, Lb5;->d:Ljava/lang/Object;

    .line 1136
    .line 1137
    check-cast v0, Ler0;

    .line 1138
    .line 1139
    invoke-virtual {v0, v2, v4}, Ler0;->x(ILjava/lang/String;)V

    .line 1140
    .line 1141
    .line 1142
    goto :goto_32

    .line 1143
    :cond_1a
    instance-of v8, v6, Ljava/lang/String;

    .line 1144
    .line 1145
    if-eqz v8, :cond_1b

    .line 1146
    .line 1147
    check-cast v6, Ljava/lang/String;

    .line 1148
    .line 1149
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v3

    .line 1153
    invoke-virtual {v3, v6, v9, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 1154
    .line 1155
    .line 1156
    move-result v2

    .line 1157
    iget-object v0, v0, Lb5;->d:Ljava/lang/Object;

    .line 1158
    .line 1159
    check-cast v0, Ler0;

    .line 1160
    .line 1161
    invoke-virtual {v0, v2, v4}, Ler0;->x(ILjava/lang/String;)V

    .line 1162
    .line 1163
    .line 1164
    :cond_1b
    :goto_32
    iget-object v0, v12, Lrs0;->i:Lra2;

    .line 1165
    .line 1166
    iget-object v2, v0, Lra2;->c:Ljava/lang/Object;

    .line 1167
    .line 1168
    check-cast v2, Ljava/util/HashMap;

    .line 1169
    .line 1170
    iget-object v3, v0, Lra2;->d:Ljava/lang/Object;

    .line 1171
    .line 1172
    check-cast v3, Ljava/util/HashMap;

    .line 1173
    .line 1174
    iget-object v4, v0, Lra2;->b:Ljava/lang/Object;

    .line 1175
    .line 1176
    check-cast v4, Lcb;

    .line 1177
    .line 1178
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1179
    .line 1180
    .line 1181
    const-string v6, "10.2.0"

    .line 1182
    .line 1183
    const-string v8, "v"

    .line 1184
    .line 1185
    invoke-virtual {v3, v8, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1186
    .line 1187
    .line 1188
    const-string v6, "dm"

    .line 1189
    .line 1190
    sget-object v8, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1191
    .line 1192
    invoke-virtual {v3, v6, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1193
    .line 1194
    .line 1195
    const-string v6, "ln"

    .line 1196
    .line 1197
    invoke-virtual {v4}, Lcb;->y()Ljava/lang/String;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v8

    .line 1201
    invoke-virtual {v3, v6, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1202
    .line 1203
    .line 1204
    const-string v6, "av"

    .line 1205
    .line 1206
    invoke-virtual {v4}, Lcb;->p()Ljava/lang/String;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v8

    .line 1210
    invoke-virtual {v3, v6, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1211
    .line 1212
    .line 1213
    const-string v6, "os"

    .line 1214
    .line 1215
    sget-object v8, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 1216
    .line 1217
    invoke-virtual {v3, v6, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1218
    .line 1219
    .line 1220
    const-string v6, "sdkType"

    .line 1221
    .line 1222
    invoke-virtual {v11, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v6

    .line 1226
    instance-of v8, v6, Ljava/lang/String;

    .line 1227
    .line 1228
    const-string v9, "s"

    .line 1229
    .line 1230
    if-eqz v8, :cond_1c

    .line 1231
    .line 1232
    check-cast v6, Ljava/lang/String;

    .line 1233
    .line 1234
    invoke-static {v6}, Lb40;->r(Ljava/lang/String;)Z

    .line 1235
    .line 1236
    .line 1237
    move-result v8

    .line 1238
    if-eqz v8, :cond_1c

    .line 1239
    .line 1240
    invoke-virtual {v3, v9, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1241
    .line 1242
    .line 1243
    goto :goto_33

    .line 1244
    :cond_1c
    const-string v6, "androidx"

    .line 1245
    .line 1246
    invoke-virtual {v3, v9, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1247
    .line 1248
    .line 1249
    :goto_33
    iget-object v0, v0, Lra2;->a:Ljava/lang/Object;

    .line 1250
    .line 1251
    check-cast v0, Ler0;

    .line 1252
    .line 1253
    iget-object v0, v0, Ler0;->b:Ljava/lang/Object;

    .line 1254
    .line 1255
    check-cast v0, Ler0;

    .line 1256
    .line 1257
    const-string v6, "language"

    .line 1258
    .line 1259
    invoke-virtual {v0, v6}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v0

    .line 1263
    invoke-static {v0}, Lb40;->r(Ljava/lang/String;)Z

    .line 1264
    .line 1265
    .line 1266
    move-result v6

    .line 1267
    if-eqz v6, :cond_1d

    .line 1268
    .line 1269
    const-string v6, "dln"

    .line 1270
    .line 1271
    invoke-virtual {v3, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1272
    .line 1273
    .line 1274
    :cond_1d
    const-string v0, "pluginVersion"

    .line 1275
    .line 1276
    invoke-virtual {v11, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v0

    .line 1280
    instance-of v6, v0, Ljava/lang/String;

    .line 1281
    .line 1282
    if-eqz v6, :cond_1e

    .line 1283
    .line 1284
    check-cast v0, Ljava/lang/String;

    .line 1285
    .line 1286
    invoke-static {v0}, Lb40;->r(Ljava/lang/String;)Z

    .line 1287
    .line 1288
    .line 1289
    move-result v6

    .line 1290
    if-eqz v6, :cond_1e

    .line 1291
    .line 1292
    const-string v6, "pv"

    .line 1293
    .line 1294
    invoke-virtual {v3, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1295
    .line 1296
    .line 1297
    :cond_1e
    const-string v0, "runtimeVersion"

    .line 1298
    .line 1299
    invoke-virtual {v11, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v0

    .line 1303
    instance-of v6, v0, Ljava/lang/String;

    .line 1304
    .line 1305
    if-eqz v6, :cond_1f

    .line 1306
    .line 1307
    check-cast v0, Ljava/lang/String;

    .line 1308
    .line 1309
    invoke-static {v0}, Lb40;->r(Ljava/lang/String;)Z

    .line 1310
    .line 1311
    .line 1312
    move-result v6

    .line 1313
    if-eqz v6, :cond_1f

    .line 1314
    .line 1315
    const-string v6, "rv"

    .line 1316
    .line 1317
    invoke-virtual {v3, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1318
    .line 1319
    .line 1320
    :cond_1f
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 1321
    .line 1322
    .line 1323
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1324
    .line 1325
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1326
    .line 1327
    .line 1328
    const-string v3, "os.version"

    .line 1329
    .line 1330
    invoke-static {v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 1331
    .line 1332
    .line 1333
    move-result-object v3

    .line 1334
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1335
    .line 1336
    .line 1337
    const-string v3, ":"

    .line 1338
    .line 1339
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1340
    .line 1341
    .line 1342
    sget-object v3, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 1343
    .line 1344
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1345
    .line 1346
    .line 1347
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v0

    .line 1351
    const-string v3, "rs"

    .line 1352
    .line 1353
    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1354
    .line 1355
    .line 1356
    iget-object v0, v4, Lcb;->b:Ljava/lang/Object;

    .line 1357
    .line 1358
    check-cast v0, Landroid/content/Context;

    .line 1359
    .line 1360
    const-string v3, "phone"

    .line 1361
    .line 1362
    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v0

    .line 1366
    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 1367
    .line 1368
    if-nez v0, :cond_20

    .line 1369
    .line 1370
    goto :goto_34

    .line 1371
    :cond_20
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimCountryIso()Ljava/lang/String;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v5

    .line 1375
    :goto_34
    invoke-static {v5}, Lb40;->r(Ljava/lang/String;)Z

    .line 1376
    .line 1377
    .line 1378
    move-result v0

    .line 1379
    if-eqz v0, :cond_21

    .line 1380
    .line 1381
    const-string v0, "cc"

    .line 1382
    .line 1383
    invoke-virtual {v2, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1384
    .line 1385
    .line 1386
    :cond_21
    const-string v0, "enableInAppNotification"

    .line 1387
    .line 1388
    invoke-virtual {v11, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v0

    .line 1392
    instance-of v2, v0, Ljava/lang/Boolean;

    .line 1393
    .line 1394
    if-eqz v2, :cond_22

    .line 1395
    .line 1396
    check-cast v0, Ljava/lang/Boolean;

    .line 1397
    .line 1398
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1399
    .line 1400
    .line 1401
    move-result v7

    .line 1402
    :cond_22
    iget-object v0, v1, Ler0;->b:Ljava/lang/Object;

    .line 1403
    .line 1404
    check-cast v0, Ler0;

    .line 1405
    .line 1406
    iget-object v0, v0, Ler0;->b:Ljava/lang/Object;

    .line 1407
    .line 1408
    check-cast v0, Landroid/content/SharedPreferences;

    .line 1409
    .line 1410
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v0

    .line 1414
    const-string v2, "enable_inapp_notificaiton"

    .line 1415
    .line 1416
    invoke-interface {v0, v2, v7}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 1417
    .line 1418
    .line 1419
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1420
    .line 1421
    .line 1422
    move-result v2

    .line 1423
    if-nez v2, :cond_23

    .line 1424
    .line 1425
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1426
    .line 1427
    .line 1428
    :cond_23
    const-string v0, "screenOrientation"

    .line 1429
    .line 1430
    invoke-virtual {v11, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v2

    .line 1434
    instance-of v3, v2, Ljava/lang/Integer;

    .line 1435
    .line 1436
    if-eqz v3, :cond_24

    .line 1437
    .line 1438
    check-cast v2, Ljava/lang/Integer;

    .line 1439
    .line 1440
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1441
    .line 1442
    .line 1443
    move-result v2

    .line 1444
    goto :goto_35

    .line 1445
    :cond_24
    const/4 v2, -0x1

    .line 1446
    :goto_35
    invoke-virtual {v1, v2, v0}, Ler0;->x(ILjava/lang/String;)V

    .line 1447
    .line 1448
    .line 1449
    iget-object v0, v12, Lrs0;->m:Lwc0;

    .line 1450
    .line 1451
    if-nez v0, :cond_25

    .line 1452
    .line 1453
    new-instance v0, Lwc0;

    .line 1454
    .line 1455
    iget-object v2, v12, Lrs0;->x:Landroid/content/Context;

    .line 1456
    .line 1457
    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v2

    .line 1461
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v2

    .line 1465
    const/16 v3, 0xe

    .line 1466
    .line 1467
    invoke-direct {v0, v3, v1, v2}, Lwc0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1468
    .line 1469
    .line 1470
    iput-object v0, v12, Lrs0;->m:Lwc0;

    .line 1471
    .line 1472
    :cond_25
    iget-object v0, v12, Lrs0;->m:Lwc0;

    .line 1473
    .line 1474
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1475
    .line 1476
    .line 1477
    iget-object v1, v0, Lwc0;->b:Ljava/lang/Object;

    .line 1478
    .line 1479
    check-cast v1, Ler0;

    .line 1480
    .line 1481
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1482
    .line 1483
    .line 1484
    move-result-wide v2

    .line 1485
    iget-object v4, v1, Ler0;->b:Ljava/lang/Object;

    .line 1486
    .line 1487
    check-cast v4, Ler0;

    .line 1488
    .line 1489
    const-string v5, "last_helpcenter_cache_eviction_time"

    .line 1490
    .line 1491
    invoke-virtual {v4, v5}, Ler0;->p(Ljava/lang/String;)J

    .line 1492
    .line 1493
    .line 1494
    move-result-wide v6

    .line 1495
    const-wide/16 v8, 0x0

    .line 1496
    .line 1497
    cmp-long v4, v6, v8

    .line 1498
    .line 1499
    if-nez v4, :cond_26

    .line 1500
    .line 1501
    iget-object v0, v1, Ler0;->b:Ljava/lang/Object;

    .line 1502
    .line 1503
    check-cast v0, Ler0;

    .line 1504
    .line 1505
    iget-object v0, v0, Ler0;->b:Ljava/lang/Object;

    .line 1506
    .line 1507
    check-cast v0, Landroid/content/SharedPreferences;

    .line 1508
    .line 1509
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1510
    .line 1511
    .line 1512
    move-result-object v0

    .line 1513
    invoke-interface {v0, v5, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 1514
    .line 1515
    .line 1516
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1517
    .line 1518
    .line 1519
    move-result v1

    .line 1520
    if-nez v1, :cond_2b

    .line 1521
    .line 1522
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1523
    .line 1524
    .line 1525
    goto :goto_37

    .line 1526
    :cond_26
    sub-long v6, v2, v6

    .line 1527
    .line 1528
    const-wide/32 v10, 0x240c8400

    .line 1529
    .line 1530
    .line 1531
    cmp-long v4, v6, v10

    .line 1532
    .line 1533
    if-gez v4, :cond_27

    .line 1534
    .line 1535
    goto :goto_37

    .line 1536
    :cond_27
    iget-object v1, v1, Ler0;->b:Ljava/lang/Object;

    .line 1537
    .line 1538
    check-cast v1, Ler0;

    .line 1539
    .line 1540
    iget-object v1, v1, Ler0;->b:Ljava/lang/Object;

    .line 1541
    .line 1542
    check-cast v1, Landroid/content/SharedPreferences;

    .line 1543
    .line 1544
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1545
    .line 1546
    .line 1547
    move-result-object v1

    .line 1548
    invoke-interface {v1, v5, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 1549
    .line 1550
    .line 1551
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1552
    .line 1553
    .line 1554
    move-result v4

    .line 1555
    if-nez v4, :cond_28

    .line 1556
    .line 1557
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1558
    .line 1559
    .line 1560
    :cond_28
    new-instance v1, Ljava/io/File;

    .line 1561
    .line 1562
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1563
    .line 1564
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 1565
    .line 1566
    .line 1567
    iget-object v0, v0, Lwc0;->c:Ljava/lang/Object;

    .line 1568
    .line 1569
    check-cast v0, Ljava/lang/String;

    .line 1570
    .line 1571
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1572
    .line 1573
    .line 1574
    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    .line 1575
    .line 1576
    const-string v5, "helpshift"

    .line 1577
    .line 1578
    const-string v6, "resource_cache"

    .line 1579
    .line 1580
    invoke-static {v4, v0, v5, v0, v6}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1581
    .line 1582
    .line 1583
    const-string v5, "helpcenter"

    .line 1584
    .line 1585
    invoke-static {v4, v0, v5}, Lfm0;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1586
    .line 1587
    .line 1588
    move-result-object v0

    .line 1589
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1590
    .line 1591
    .line 1592
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v0

    .line 1596
    if-eqz v0, :cond_2b

    .line 1597
    .line 1598
    array-length v1, v0

    .line 1599
    if-nez v1, :cond_29

    .line 1600
    .line 1601
    goto :goto_37

    .line 1602
    :cond_29
    array-length v1, v0

    .line 1603
    :goto_36
    if-ge v15, v1, :cond_2b

    .line 1604
    .line 1605
    aget-object v4, v0, v15

    .line 1606
    .line 1607
    invoke-virtual {v4}, Ljava/io/File;->lastModified()J

    .line 1608
    .line 1609
    .line 1610
    move-result-wide v5

    .line 1611
    cmp-long v7, v5, v8

    .line 1612
    .line 1613
    if-eqz v7, :cond_2a

    .line 1614
    .line 1615
    sub-long v5, v2, v5

    .line 1616
    .line 1617
    const-wide v10, 0x9a7ec800L

    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    cmp-long v5, v5, v10

    .line 1623
    .line 1624
    if-lez v5, :cond_2a

    .line 1625
    .line 1626
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 1627
    .line 1628
    .line 1629
    :cond_2a
    add-int/lit8 v15, v15, 0x1

    .line 1630
    .line 1631
    goto :goto_36

    .line 1632
    :cond_2b
    :goto_37
    iget-object v0, v12, Lrs0;->f:Lnm;

    .line 1633
    .line 1634
    invoke-virtual {v0}, Lnm;->b()V

    .line 1635
    .line 1636
    .line 1637
    return-void

    .line 1638
    nop

    .line 1639
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
