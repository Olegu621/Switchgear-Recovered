.class public final Ln51;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final Companion:Ll51;


# instance fields
.field public final a:Lk51;

.field public final b:Lg80;

.field public final c:Li03;

.field public d:Ljava/lang/String;

.field public e:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

.field public f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ll51;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ln51;->Companion:Ll51;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lk51;Lg80;Li03;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Ln51;->a:Lk51;

    .line 11
    .line 12
    iput-object p2, p0, Ln51;->b:Lg80;

    .line 13
    .line 14
    iput-object p3, p0, Ln51;->c:Li03;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLd10;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p5, Lm51;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lm51;

    .line 7
    .line 8
    iget v1, v0, Lm51;->e:I

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
    iput v1, v0, Lm51;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lm51;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, Lm51;-><init>(Ln51;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, Lm51;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lm51;->e:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-object p3, v0, Lm51;->b:Ljava/lang/String;

    .line 38
    .line 39
    iget-object p0, v0, Lm51;->a:Ln51;

    .line 40
    .line 41
    invoke-static {p5}, Lpg3;->A(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v3

    .line 51
    :cond_2
    invoke-static {p5}, Lpg3;->A(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iput-object p0, v0, Lm51;->a:Ln51;

    .line 55
    .line 56
    iput-object p3, v0, Lm51;->b:Ljava/lang/String;

    .line 57
    .line 58
    iput v4, v0, Lm51;->e:I

    .line 59
    .line 60
    iget-object p5, p0, Ln51;->a:Lk51;

    .line 61
    .line 62
    invoke-virtual {p5, p1, p2, p4, v0}, Lk51;->i(Ljava/lang/String;Ljava/lang/String;ZLd10;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p5

    .line 66
    if-ne p5, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    :goto_1
    check-cast p5, Lk91;

    .line 70
    .line 71
    iget-object p1, p5, Lk91;->b:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 72
    .line 73
    iput-object p1, p0, Ln51;->e:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 74
    .line 75
    iget-boolean p1, p5, Lk91;->c:Z

    .line 76
    .line 77
    iput-boolean p1, p0, Ln51;->f:Z

    .line 78
    .line 79
    iget-object p1, p5, Lk91;->a:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p1, Ljava/lang/Iterable;

    .line 82
    .line 83
    new-instance p2, Ljava/util/ArrayList;

    .line 84
    .line 85
    const/16 p4, 0xa

    .line 86
    .line 87
    invoke-static {p1, p4}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 88
    .line 89
    .line 90
    move-result p4

    .line 91
    invoke-direct {p2, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result p4

    .line 102
    if-eqz p4, :cond_4

    .line 103
    .line 104
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p4

    .line 108
    check-cast p4, Ljava/lang/String;

    .line 109
    .line 110
    sget-object p5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 111
    .line 112
    invoke-virtual {p4, p5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p4

    .line 116
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_4
    iget-object p1, p0, Ln51;->c:Li03;

    .line 124
    .line 125
    iget-object p4, p0, Ln51;->b:Lg80;

    .line 126
    .line 127
    check-cast p4, Lpz2;

    .line 128
    .line 129
    iget-object p4, p4, Lpz2;->f:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;

    .line 130
    .line 131
    iget-object p4, p4, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;->c:Ljava/lang/String;

    .line 132
    .line 133
    invoke-static {p4}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 134
    .line 135
    .line 136
    move-result p5

    .line 137
    if-nez p5, :cond_5

    .line 138
    .line 139
    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result p5

    .line 143
    if-eqz p5, :cond_5

    .line 144
    .line 145
    move-object p3, p4

    .line 146
    goto/16 :goto_8

    .line 147
    .line 148
    :cond_5
    invoke-static {p3}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 149
    .line 150
    .line 151
    move-result p4

    .line 152
    if-nez p4, :cond_6

    .line 153
    .line 154
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result p4

    .line 158
    if-eqz p4, :cond_6

    .line 159
    .line 160
    goto/16 :goto_8

    .line 161
    .line 162
    :cond_6
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 163
    .line 164
    .line 165
    move-result-object p3

    .line 166
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object p4

    .line 173
    :cond_7
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result p5

    .line 177
    if-eqz p5, :cond_8

    .line 178
    .line 179
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p5

    .line 183
    move-object v0, p5

    .line 184
    check-cast v0, Ljava/lang/String;

    .line 185
    .line 186
    invoke-static {v0}, Lxt0;->a(Ljava/lang/String;)Ljava/util/Locale;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-virtual {p3}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-eqz v1, :cond_7

    .line 203
    .line 204
    invoke-virtual {p3}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-eqz v0, :cond_7

    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_8
    move-object p5, v3

    .line 220
    :goto_3
    check-cast p5, Ljava/lang/String;

    .line 221
    .line 222
    if-eqz p5, :cond_9

    .line 223
    .line 224
    :goto_4
    move-object p3, p5

    .line 225
    goto :goto_6

    .line 226
    :cond_9
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object p4

    .line 230
    :cond_a
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result p5

    .line 234
    if-eqz p5, :cond_b

    .line 235
    .line 236
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object p5

    .line 240
    move-object v0, p5

    .line 241
    check-cast v0, Ljava/lang/String;

    .line 242
    .line 243
    invoke-static {v0}, Lxt0;->a(Ljava/lang/String;)Ljava/util/Locale;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-virtual {p3}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    if-eqz v0, :cond_a

    .line 260
    .line 261
    goto :goto_5

    .line 262
    :cond_b
    move-object p5, v3

    .line 263
    :goto_5
    check-cast p5, Ljava/lang/String;

    .line 264
    .line 265
    goto :goto_4

    .line 266
    :goto_6
    if-eqz p3, :cond_c

    .line 267
    .line 268
    invoke-static {p3}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 269
    .line 270
    .line 271
    move-result p4

    .line 272
    xor-int/2addr p4, v4

    .line 273
    if-ne p4, v4, :cond_c

    .line 274
    .line 275
    const-string p2, "The language has been set to the device language."

    .line 276
    .line 277
    invoke-interface {p1, p2, v3}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 278
    .line 279
    .line 280
    goto :goto_8

    .line 281
    :cond_c
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object p2

    .line 285
    move-object p3, p2

    .line 286
    check-cast p3, Ljava/lang/String;

    .line 287
    .line 288
    if-eqz p3, :cond_e

    .line 289
    .line 290
    invoke-static {p3}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 291
    .line 292
    .line 293
    move-result p2

    .line 294
    if-eqz p2, :cond_d

    .line 295
    .line 296
    goto :goto_7

    .line 297
    :cond_d
    sget-object p2, Ln51;->Companion:Ll51;

    .line 298
    .line 299
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    new-instance p2, Ljava/lang/StringBuilder;

    .line 303
    .line 304
    const-string p4, "The language has been set to the first of those available, "

    .line 305
    .line 306
    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    const-string p4, "."

    .line 313
    .line 314
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object p2

    .line 321
    invoke-interface {p1, p2, v3}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 322
    .line 323
    .line 324
    goto :goto_8

    .line 325
    :cond_e
    :goto_7
    const-string p2, "The language has been set to the default one, English."

    .line 326
    .line 327
    invoke-interface {p1, p2, v3}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 328
    .line 329
    .line 330
    const-string p3, "en"

    .line 331
    .line 332
    :goto_8
    iput-object p3, p0, Ln51;->d:Ljava/lang/String;

    .line 333
    .line 334
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 335
    .line 336
    return-object p0
.end method
