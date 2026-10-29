.class public final Le91;
.super Lb91;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lg71;

.field public final b:Ld91;


# direct methods
.method public constructor <init>(Lg71;Lt33;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le91;->a:Lg71;

    .line 5
    .line 6
    new-instance p1, Lac1;

    .line 7
    .line 8
    sget-object v0, Ld91;->f:Lwm0;

    .line 9
    .line 10
    invoke-direct {p1, p2, v0}, Lac1;-><init>(Lt33;Ls33;)V

    .line 11
    .line 12
    .line 13
    const-class p2, Ld91;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const-string v1, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p1, p2, v0}, Lac1;->l(Ljava/lang/Class;Ljava/lang/String;)Lq33;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Ld91;

    .line 32
    .line 33
    iput-object p1, p0, Le91;->b:Ld91;

    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 37
    .line 38
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    throw p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;Ljava/io/PrintWriter;)V
    .locals 10

    .line 1
    iget-object p0, p0, Le91;->b:Ld91;

    .line 2
    .line 3
    iget-object v0, p0, Ld91;->d:Lvf2;

    .line 4
    .line 5
    iget v0, v0, Lvf2;->c:I

    .line 6
    .line 7
    if-lez v0, :cond_7

    .line 8
    .line 9
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "Loaders:"

    .line 13
    .line 14
    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, "    "

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v1, 0x0

    .line 35
    move v2, v1

    .line 36
    :goto_0
    iget-object v3, p0, Ld91;->d:Lvf2;

    .line 37
    .line 38
    iget v4, v3, Lvf2;->c:I

    .line 39
    .line 40
    if-ge v2, v4, :cond_7

    .line 41
    .line 42
    iget-object v3, v3, Lvf2;->b:[Ljava/lang/Object;

    .line 43
    .line 44
    aget-object v3, v3, v2

    .line 45
    .line 46
    check-cast v3, Lc91;

    .line 47
    .line 48
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v4, "  #"

    .line 52
    .line 53
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-object v4, p0, Ld91;->d:Lvf2;

    .line 57
    .line 58
    iget-object v4, v4, Lvf2;->a:[I

    .line 59
    .line 60
    aget v4, v4, v2

    .line 61
    .line 62
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(I)V

    .line 63
    .line 64
    .line 65
    const-string v4, ": "

    .line 66
    .line 67
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3}, Lc91;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const-string v4, "mId="

    .line 81
    .line 82
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 86
    .line 87
    .line 88
    const-string v5, " mArgs="

    .line 89
    .line 90
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const/4 v5, 0x0

    .line 94
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    const-string v5, "mLoader="

    .line 101
    .line 102
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    iget-object v5, v3, Lc91;->l:Llc3;

    .line 106
    .line 107
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    iget-object v5, v3, Lc91;->l:Llc3;

    .line 111
    .line 112
    const-string v6, "  "

    .line 113
    .line 114
    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p2, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 128
    .line 129
    .line 130
    const-string v4, " mListener="

    .line 131
    .line 132
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    iget-object v4, v5, Llc3;->a:Lc91;

    .line 136
    .line 137
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    iget-boolean v4, v5, Llc3;->b:Z

    .line 141
    .line 142
    const-string v8, "mStarted="

    .line 143
    .line 144
    if-nez v4, :cond_0

    .line 145
    .line 146
    iget-boolean v4, v5, Llc3;->e:Z

    .line 147
    .line 148
    if-nez v4, :cond_0

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_0
    invoke-virtual {p2, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p2, v8}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    iget-boolean v4, v5, Llc3;->b:Z

    .line 158
    .line 159
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Z)V

    .line 160
    .line 161
    .line 162
    const-string v4, " mContentChanged="

    .line 163
    .line 164
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    iget-boolean v4, v5, Llc3;->e:Z

    .line 168
    .line 169
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Z)V

    .line 170
    .line 171
    .line 172
    const-string v4, " mProcessingChange="

    .line 173
    .line 174
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->println(Z)V

    .line 178
    .line 179
    .line 180
    :goto_1
    iget-boolean v4, v5, Llc3;->c:Z

    .line 181
    .line 182
    if-nez v4, :cond_1

    .line 183
    .line 184
    iget-boolean v4, v5, Llc3;->d:Z

    .line 185
    .line 186
    if-eqz v4, :cond_2

    .line 187
    .line 188
    :cond_1
    invoke-virtual {p2, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    const-string v4, "mAbandoned="

    .line 192
    .line 193
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    iget-boolean v4, v5, Llc3;->c:Z

    .line 197
    .line 198
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Z)V

    .line 199
    .line 200
    .line 201
    const-string v4, " mReset="

    .line 202
    .line 203
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    iget-boolean v4, v5, Llc3;->d:Z

    .line 207
    .line 208
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->println(Z)V

    .line 209
    .line 210
    .line 211
    :cond_2
    iget-object v4, v5, Llc3;->g:Lvd;

    .line 212
    .line 213
    const-string v9, " waiting="

    .line 214
    .line 215
    if-eqz v4, :cond_3

    .line 216
    .line 217
    invoke-virtual {p2, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    const-string v4, "mTask="

    .line 221
    .line 222
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    iget-object v4, v5, Llc3;->g:Lvd;

    .line 226
    .line 227
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    iget-object v4, v5, Llc3;->g:Lvd;

    .line 234
    .line 235
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->println(Z)V

    .line 239
    .line 240
    .line 241
    :cond_3
    iget-object v4, v5, Llc3;->h:Lvd;

    .line 242
    .line 243
    if-eqz v4, :cond_4

    .line 244
    .line 245
    invoke-virtual {p2, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    const-string v4, "mCancellingTask="

    .line 249
    .line 250
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    iget-object v4, v5, Llc3;->h:Lvd;

    .line 254
    .line 255
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {p2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    iget-object v4, v5, Llc3;->h:Lvd;

    .line 262
    .line 263
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->println(Z)V

    .line 267
    .line 268
    .line 269
    :cond_4
    iget-object v4, v3, Lc91;->n:Lzr3;

    .line 270
    .line 271
    if-eqz v4, :cond_5

    .line 272
    .line 273
    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    const-string v4, "mCallbacks="

    .line 277
    .line 278
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    iget-object v4, v3, Lc91;->n:Lzr3;

    .line 282
    .line 283
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    iget-object v4, v3, Lc91;->n:Lzr3;

    .line 287
    .line 288
    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v5

    .line 292
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    const-string v5, "mDeliveredData="

    .line 299
    .line 300
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    iget-boolean v4, v4, Lzr3;->b:Z

    .line 304
    .line 305
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->println(Z)V

    .line 306
    .line 307
    .line 308
    :cond_5
    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    const-string v4, "mData="

    .line 312
    .line 313
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    iget-object v4, v3, Lc91;->l:Llc3;

    .line 317
    .line 318
    invoke-virtual {v3}, La91;->d()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v5

    .line 322
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    new-instance v4, Ljava/lang/StringBuilder;

    .line 326
    .line 327
    const/16 v6, 0x40

    .line 328
    .line 329
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 330
    .line 331
    .line 332
    invoke-static {v4, v5}, Lhe3;->a(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    const-string v5, "}"

    .line 336
    .line 337
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v4

    .line 344
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {p2, v8}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    iget v3, v3, La91;->c:I

    .line 354
    .line 355
    if-lez v3, :cond_6

    .line 356
    .line 357
    const/4 v3, 0x1

    .line 358
    goto :goto_2

    .line 359
    :cond_6
    move v3, v1

    .line 360
    :goto_2
    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->println(Z)V

    .line 361
    .line 362
    .line 363
    add-int/lit8 v2, v2, 0x1

    .line 364
    .line 365
    goto/16 :goto_0

    .line 366
    .line 367
    :cond_7
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x80

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-string v1, "LoaderManager{"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, " in "

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Le91;->a:Lg71;

    .line 30
    .line 31
    invoke-static {v0, p0}, Lhe3;->a(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    const-string p0, "}}"

    .line 35
    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method
