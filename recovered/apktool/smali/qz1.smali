.class public final Lqz1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method public static a(Lxz1;)Ljava/util/LinkedHashMap;
    .locals 14

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lxz1;->b:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x0

    .line 20
    move v3, v2

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x1

    .line 27
    if-eqz v4, :cond_5

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, Ljava/util/Map$Entry;

    .line 34
    .line 35
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Lrf2;

    .line 40
    .line 41
    iget-object v4, v4, Lrf2;->a:Ljava/util/TreeSet;

    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    instance-of v7, v4, Ljava/util/List;

    .line 47
    .line 48
    if-eqz v7, :cond_2

    .line 49
    .line 50
    check-cast v4, Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-eqz v7, :cond_1

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    sub-int/2addr v5, v6

    .line 64
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    goto :goto_2

    .line 69
    :cond_2
    invoke-virtual {v4}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-nez v6, :cond_3

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    if-eqz v6, :cond_4

    .line 89
    .line 90
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    goto :goto_1

    .line 95
    :cond_4
    :goto_2
    check-cast v5, Ljava/lang/Comparable;

    .line 96
    .line 97
    check-cast v5, Ljava/lang/Integer;

    .line 98
    .line 99
    if-eqz v5, :cond_0

    .line 100
    .line 101
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    goto :goto_0

    .line 110
    :cond_5
    iget-object v1, p0, Lxz1;->d:Lwp0;

    .line 111
    .line 112
    if-eqz v1, :cond_6

    .line 113
    .line 114
    iget-object v1, v1, Lwp0;->f:Ljava/util/Map;

    .line 115
    .line 116
    if-eqz v1, :cond_6

    .line 117
    .line 118
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    goto :goto_3

    .line 123
    :cond_6
    const/16 v1, 0xb

    .line 124
    .line 125
    :goto_3
    new-instance v4, Lkotlin/ranges/IntRange;

    .line 126
    .line 127
    invoke-direct {v4, v6, v1, v6}, Lkotlin/ranges/a;-><init>(III)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    :goto_4
    move-object v4, v1

    .line 135
    check-cast v4, Lyy0;

    .line 136
    .line 137
    iget-boolean v4, v4, Lyy0;->c:Z

    .line 138
    .line 139
    if-eqz v4, :cond_13

    .line 140
    .line 141
    move-object v4, v1

    .line 142
    check-cast v4, Lwy0;

    .line 143
    .line 144
    invoke-virtual {v4}, Lwy0;->nextInt()I

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    new-instance v7, Lkotlin/ranges/IntRange;

    .line 149
    .line 150
    invoke-direct {v7, v6, v3, v6}, Lkotlin/ranges/a;-><init>(III)V

    .line 151
    .line 152
    .line 153
    new-instance v8, Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v7}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    :cond_7
    :goto_5
    move-object v9, v7

    .line 163
    check-cast v9, Lyy0;

    .line 164
    .line 165
    iget-boolean v9, v9, Lyy0;->c:Z

    .line 166
    .line 167
    if-eqz v9, :cond_c

    .line 168
    .line 169
    move-object v9, v7

    .line 170
    check-cast v9, Lwy0;

    .line 171
    .line 172
    invoke-virtual {v9}, Lwy0;->nextInt()I

    .line 173
    .line 174
    .line 175
    move-result v9

    .line 176
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    .line 178
    .line 179
    move-result-object v9

    .line 180
    invoke-virtual {p0, v9}, Lxz1;->b(Ljava/lang/Integer;)Ljava/util/ArrayList;

    .line 181
    .line 182
    .line 183
    move-result-object v9

    .line 184
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object v9

    .line 188
    move-object v10, v5

    .line 189
    :cond_8
    :goto_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 190
    .line 191
    .line 192
    move-result v11

    .line 193
    if-eqz v11, :cond_b

    .line 194
    .line 195
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v11

    .line 199
    check-cast v11, Lwz1;

    .line 200
    .line 201
    iget-object v12, v11, Lwz1;->a:Ljava/lang/Integer;

    .line 202
    .line 203
    if-nez v12, :cond_9

    .line 204
    .line 205
    goto :goto_6

    .line 206
    :cond_9
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 207
    .line 208
    .line 209
    move-result v12

    .line 210
    if-ne v12, v4, :cond_8

    .line 211
    .line 212
    if-eqz v10, :cond_a

    .line 213
    .line 214
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 215
    .line 216
    .line 217
    move-result v12

    .line 218
    invoke-virtual {v11}, Lwz1;->b()Ll42;

    .line 219
    .line 220
    .line 221
    move-result-object v13

    .line 222
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    .line 223
    .line 224
    .line 225
    move-result v13

    .line 226
    if-le v12, v13, :cond_8

    .line 227
    .line 228
    :cond_a
    invoke-virtual {v11}, Lwz1;->b()Ll42;

    .line 229
    .line 230
    .line 231
    move-result-object v10

    .line 232
    goto :goto_6

    .line 233
    :cond_b
    if-eqz v10, :cond_7

    .line 234
    .line 235
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_c
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 240
    .line 241
    .line 242
    move-result-object v7

    .line 243
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 244
    .line 245
    .line 246
    move-result v8

    .line 247
    if-nez v8, :cond_d

    .line 248
    .line 249
    move-object v8, v5

    .line 250
    goto :goto_7

    .line 251
    :cond_d
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v8

    .line 255
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 256
    .line 257
    .line 258
    move-result v9

    .line 259
    if-nez v9, :cond_e

    .line 260
    .line 261
    goto :goto_7

    .line 262
    :cond_e
    move-object v9, v8

    .line 263
    check-cast v9, Ll42;

    .line 264
    .line 265
    iget v9, v9, Ll42;->a:I

    .line 266
    .line 267
    neg-int v9, v9

    .line 268
    :cond_f
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v10

    .line 272
    move-object v11, v10

    .line 273
    check-cast v11, Ll42;

    .line 274
    .line 275
    iget v11, v11, Ll42;->a:I

    .line 276
    .line 277
    neg-int v11, v11

    .line 278
    if-ge v9, v11, :cond_10

    .line 279
    .line 280
    move-object v8, v10

    .line 281
    move v9, v11

    .line 282
    :cond_10
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 283
    .line 284
    .line 285
    move-result v10

    .line 286
    if-nez v10, :cond_f

    .line 287
    .line 288
    :goto_7
    check-cast v8, Ll42;

    .line 289
    .line 290
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    if-nez v8, :cond_11

    .line 295
    .line 296
    const-string v7, ""

    .line 297
    .line 298
    goto :goto_9

    .line 299
    :cond_11
    new-instance v7, Ljava/lang/StringBuilder;

    .line 300
    .line 301
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 302
    .line 303
    .line 304
    move v9, v2

    .line 305
    :goto_8
    if-ge v9, v3, :cond_12

    .line 306
    .line 307
    iget v10, v8, Ll42;->a:I

    .line 308
    .line 309
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    add-int/lit8 v9, v9, 0x1

    .line 313
    .line 314
    goto :goto_8

    .line 315
    :cond_12
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v7

    .line 319
    :goto_9
    invoke-interface {v0, v4, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    goto/16 :goto_4

    .line 323
    .line 324
    :cond_13
    return-object v0
.end method
