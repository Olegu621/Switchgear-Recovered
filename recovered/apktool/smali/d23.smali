.class public final Ld23;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method public static a(Ljava/lang/String;)Lu13;
    .locals 9

    .line 1
    sget-object v0, Lvy0;->Companion:Luy0;

    .line 2
    .line 3
    sget-object v1, Lrj;->Companion:Lqj;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/16 v2, 0x10

    .line 7
    .line 8
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {v2, v3}, Luy0;->a(ILjava/lang/String;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    long-to-int v0, v3

    .line 20
    sget-object v3, Lx13;->Companion:Lw13;

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    invoke-static {v4}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const/4 v5, 0x1

    .line 31
    invoke-static {v5, v4}, Luy0;->a(ILjava/lang/String;)J

    .line 32
    .line 33
    .line 34
    move-result-wide v6

    .line 35
    long-to-int v4, v6

    .line 36
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    if-ne v4, v5, :cond_0

    .line 42
    .line 43
    sget-object v3, Lx13;->b:Lx13;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    new-instance p0, Ljava/lang/Throwable;

    .line 47
    .line 48
    const-string v0, "Invalid Value for VectorEncodingType: "

    .line 49
    .line 50
    const-string v1, ", valid values are 0 and 1"

    .line 51
    .line 52
    invoke-static {v4, v0, v1}, Len;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-direct {p0, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p0

    .line 60
    :cond_1
    sget-object v3, Lx13;->a:Lx13;

    .line 61
    .line 62
    :goto_0
    sget-object v4, Lx13;->b:Lx13;

    .line 63
    .line 64
    const/16 v5, 0x11

    .line 65
    .line 66
    if-ne v3, v4, :cond_4

    .line 67
    .line 68
    new-instance v0, Lu13;

    .line 69
    .line 70
    invoke-direct {v0}, Lu13;-><init>()V

    .line 71
    .line 72
    .line 73
    const/16 v3, 0x1d

    .line 74
    .line 75
    invoke-virtual {p0, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    const/16 v5, 0xc

    .line 80
    .line 81
    invoke-static {v5, v4}, Luy0;->a(ILjava/lang/String;)J

    .line 82
    .line 83
    .line 84
    move-result-wide v4

    .line 85
    long-to-int v4, v4

    .line 86
    :goto_1
    if-ge v1, v4, :cond_5

    .line 87
    .line 88
    sget-object v5, Lek;->Companion:Ldk;

    .line 89
    .line 90
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    invoke-static {v6}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    const-string v5, "1"

    .line 105
    .line 106
    invoke-virtual {v6, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    sget-object v6, Lrj;->Companion:Lqj;

    .line 111
    .line 112
    add-int/lit8 v6, v3, 0x1

    .line 113
    .line 114
    sget-object v7, Lvy0;->Companion:Luy0;

    .line 115
    .line 116
    add-int/lit8 v8, v3, 0x11

    .line 117
    .line 118
    invoke-virtual {p0, v6, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-static {v2, v6}, Luy0;->a(ILjava/lang/String;)J

    .line 126
    .line 127
    .line 128
    move-result-wide v6

    .line 129
    long-to-int v6, v6

    .line 130
    if-eqz v5, :cond_2

    .line 131
    .line 132
    add-int/lit8 v3, v3, 0x21

    .line 133
    .line 134
    invoke-virtual {p0, v8, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    invoke-static {v2, v5}, Luy0;->a(ILjava/lang/String;)J

    .line 139
    .line 140
    .line 141
    move-result-wide v7

    .line 142
    long-to-int v5, v7

    .line 143
    if-gt v6, v5, :cond_3

    .line 144
    .line 145
    :goto_2
    invoke-virtual {v0, v6}, Lu13;->b(I)V

    .line 146
    .line 147
    .line 148
    if-eq v6, v5, :cond_3

    .line 149
    .line 150
    add-int/lit8 v6, v6, 0x1

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_2
    invoke-virtual {v0, v6}, Lu13;->b(I)V

    .line 154
    .line 155
    .line 156
    move v3, v8

    .line 157
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_4
    add-int v3, v5, v0

    .line 161
    .line 162
    invoke-virtual {p0, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    sget-object v1, Ljj0;->Companion:Lij0;

    .line 167
    .line 168
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-static {v0, p0}, Lij0;->a(Ljava/lang/Integer;Ljava/lang/String;)Lu13;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    :cond_5
    iput v3, v0, Lu13;->a:I

    .line 180
    .line 181
    return-object v0
.end method

.method public static b(Lu13;)Ljava/lang/String;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v7, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v6, Lh22;

    .line 10
    .line 11
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, v6, Lh22;->a:Ljava/lang/Object;

    .line 20
    .line 21
    sget-object v0, Lvy0;->Companion:Luy0;

    .line 22
    .line 23
    new-instance v1, Luh2;

    .line 24
    .line 25
    iget v2, p0, Lu13;->b:I

    .line 26
    .line 27
    invoke-direct {v1, v2}, Luh2;-><init>(I)V

    .line 28
    .line 29
    .line 30
    sget-object v2, Lrj;->Companion:Lqj;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const/16 v8, 0x10

    .line 36
    .line 37
    invoke-static {v1, v8}, Luy0;->b(Luh2;I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    new-instance v1, Lh22;

    .line 42
    .line 43
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v0, ""

    .line 47
    .line 48
    iput-object v0, v1, Lh22;->a:Ljava/lang/Object;

    .line 49
    .line 50
    new-instance v2, Le22;

    .line 51
    .line 52
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    const/16 v0, 0x11

    .line 56
    .line 57
    iget v3, p0, Lu13;->b:I

    .line 58
    .line 59
    add-int v5, v0, v3

    .line 60
    .line 61
    new-instance v4, Lf22;

    .line 62
    .line 63
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    const/16 v0, 0x1d

    .line 67
    .line 68
    iput v0, v4, Lf22;->a:I

    .line 69
    .line 70
    new-instance v0, Lc23;

    .line 71
    .line 72
    move-object v3, p0

    .line 73
    invoke-direct/range {v0 .. v7}, Lc23;-><init>(Lh22;Le22;Lu13;Lf22;ILh22;Ljava/util/ArrayList;)V

    .line 74
    .line 75
    .line 76
    const/4 p0, 0x1

    .line 77
    move v4, p0

    .line 78
    :goto_0
    iget v5, v3, Lu13;->b:I

    .line 79
    .line 80
    if-gt v4, v5, :cond_0

    .line 81
    .line 82
    invoke-virtual {v3, v4}, Lu13;->a(I)Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    invoke-virtual {v0, v5, v6}, Lc23;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    add-int/lit8 v4, v4, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    iget-boolean v0, v2, Le22;->a:Z

    .line 101
    .line 102
    if-eqz v0, :cond_4

    .line 103
    .line 104
    sget-object v0, Lx13;->Companion:Lw13;

    .line 105
    .line 106
    const-string v0, "1"

    .line 107
    .line 108
    invoke-virtual {v9, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    new-instance v2, Luh2;

    .line 117
    .line 118
    invoke-direct {v2, v1}, Luh2;-><init>(I)V

    .line 119
    .line 120
    .line 121
    const/16 v1, 0xc

    .line 122
    .line 123
    invoke-static {v2, v1}, Luy0;->b(Luh2;I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-eqz v3, :cond_3

    .line 136
    .line 137
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    check-cast v3, Ljava/util/List;

    .line 142
    .line 143
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    const/4 v5, 0x0

    .line 148
    if-ne v4, p0, :cond_2

    .line 149
    .line 150
    move v4, p0

    .line 151
    goto :goto_2

    .line 152
    :cond_2
    move v4, v5

    .line 153
    :goto_2
    sget-object v6, Lek;->Companion:Ldk;

    .line 154
    .line 155
    xor-int/lit8 v7, v4, 0x1

    .line 156
    .line 157
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-static {v7}, Ldk;->a(Z)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    new-instance v7, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    sget-object v6, Lvy0;->Companion:Luy0;

    .line 180
    .line 181
    new-instance v7, Luh2;

    .line 182
    .line 183
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    check-cast v5, Ljava/lang/Number;

    .line 188
    .line 189
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    invoke-direct {v7, v5}, Luh2;-><init>(I)V

    .line 194
    .line 195
    .line 196
    sget-object v5, Lrj;->Companion:Lqj;

    .line 197
    .line 198
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-static {v7, v8}, Luy0;->b(Luh2;I)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    new-instance v6, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    if-nez v4, :cond_1

    .line 221
    .line 222
    new-instance v4, Luh2;

    .line 223
    .line 224
    invoke-interface {v3, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    check-cast v3, Ljava/lang/Number;

    .line 229
    .line 230
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    invoke-direct {v4, v3}, Luh2;-><init>(I)V

    .line 235
    .line 236
    .line 237
    invoke-static {v4, v8}, Luy0;->b(Luh2;I)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    new-instance v4, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    goto :goto_1

    .line 257
    :cond_3
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    return-object p0

    .line 262
    :cond_4
    sget-object p0, Lx13;->Companion:Lw13;

    .line 263
    .line 264
    const-string p0, "0"

    .line 265
    .line 266
    invoke-virtual {v9, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    iget-object v0, v1, Lh22;->a:Ljava/lang/Object;

    .line 271
    .line 272
    new-instance v1, Ljava/lang/StringBuilder;

    .line 273
    .line 274
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    return-object p0
.end method
