.class public final Lcom/quago/mobile/sdk/l;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public A:I

.field public B:Z

.field public C:Ljava/util/LinkedList;

.field public D:Ljava/util/LinkedList;

.field public E:Ljava/util/LinkedList;

.field public F:Ljava/util/LinkedList;

.field public G:Ljava/util/LinkedList;

.field public H:Ljava/util/LinkedList;

.field public I:Ljava/util/LinkedList;

.field public J:Ljava/util/LinkedList;

.field public K:Ljava/util/LinkedList;

.field public L:Ljava/util/LinkedList;

.field public M:Ljava/util/LinkedList;

.field public N:Ljava/util/LinkedList;

.field public O:Ljava/util/LinkedList;

.field public P:Ljava/util/LinkedList;

.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:I

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:J

.field public r:J

.field public s:Lcom/quago/mobile/sdk/p0;

.field public t:Lcom/quago/mobile/sdk/h1;

.field public u:I

.field public v:I

.field public w:I

.field public x:I

.field public y:Lcom/quago/mobile/sdk/a;

.field public z:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a(Ljava/lang/StringBuilder;Ljava/util/LinkedList;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    .line 998
    :cond_0
    invoke-virtual {p1}, Ljava/util/LinkedList;->size()I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "\n"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/TreeMap;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->a:Ljava/lang/String;

    .line 7
    .line 8
    const-string v2, "app_token"

    .line 9
    .line 10
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->b:Ljava/lang/String;

    .line 14
    .line 15
    const-string v2, "user_id"

    .line 16
    .line 17
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->c:Ljava/lang/String;

    .line 21
    .line 22
    const-string v2, "additional_id"

    .line 23
    .line 24
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, "platform"

    .line 33
    .line 34
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    iget v1, p0, Lcom/quago/mobile/sdk/l;->d:I

    .line 38
    .line 39
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v2, "wrapper"

    .line 44
    .line 45
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->e:Ljava/lang/String;

    .line 49
    .line 50
    const-string v2, "wrapper_version"

    .line 51
    .line 52
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->f:Ljava/lang/String;

    .line 56
    .line 57
    const-string v2, "seg_name"

    .line 58
    .line 59
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->g:Ljava/lang/String;

    .line 63
    .line 64
    const-string v2, "seg_id"

    .line 65
    .line 66
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->h:Ljava/lang/String;

    .line 70
    .line 71
    const-string v2, "session_id"

    .line 72
    .line 73
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->i:Ljava/lang/String;

    .line 77
    .line 78
    const-string v2, "app_package_name"

    .line 79
    .line 80
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->j:Ljava/lang/String;

    .line 84
    .line 85
    const-string v2, "app_version_name"

    .line 86
    .line 87
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->k:Ljava/lang/String;

    .line 91
    .line 92
    const-string v2, "app_version_code"

    .line 93
    .line 94
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->l:Ljava/lang/String;

    .line 98
    .line 99
    const-string v2, "sdk_version_name"

    .line 100
    .line 101
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    iget v1, p0, Lcom/quago/mobile/sdk/l;->m:I

    .line 105
    .line 106
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    const-string v2, "seg_count"

    .line 111
    .line 112
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    iget v1, p0, Lcom/quago/mobile/sdk/l;->n:I

    .line 116
    .line 117
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    const-string v2, "user_seg_count"

    .line 122
    .line 123
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    iget v1, p0, Lcom/quago/mobile/sdk/l;->o:I

    .line 127
    .line 128
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    const-string v2, "mode"

    .line 133
    .line 134
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    iget v1, p0, Lcom/quago/mobile/sdk/l;->p:I

    .line 138
    .line 139
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    const-string v2, "flavor"

    .line 144
    .line 145
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    iget-wide v1, p0, Lcom/quago/mobile/sdk/l;->q:J

    .line 149
    .line 150
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    const-string v2, "active_sensors"

    .line 155
    .line 156
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    iget-wide v1, p0, Lcom/quago/mobile/sdk/l;->r:J

    .line 160
    .line 161
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    const-string v2, "supported_sensors"

    .line 166
    .line 167
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->s:Lcom/quago/mobile/sdk/p0;

    .line 171
    .line 172
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    new-instance v2, Ljava/util/TreeMap;

    .line 176
    .line 177
    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    .line 178
    .line 179
    .line 180
    iget-object v3, v1, Lcom/quago/mobile/sdk/p0;->a:Lcom/quago/mobile/sdk/d0;

    .line 181
    .line 182
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    new-instance v4, Ljava/util/TreeMap;

    .line 186
    .line 187
    invoke-direct {v4}, Ljava/util/TreeMap;-><init>()V

    .line 188
    .line 189
    .line 190
    iget-object v5, v3, Lcom/quago/mobile/sdk/d0;->a:Ljava/lang/String;

    .line 191
    .line 192
    const-string v6, "board"

    .line 193
    .line 194
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    iget-object v5, v3, Lcom/quago/mobile/sdk/d0;->b:Ljava/lang/String;

    .line 198
    .line 199
    const-string v6, "bootloader"

    .line 200
    .line 201
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    iget-object v5, v3, Lcom/quago/mobile/sdk/d0;->c:Ljava/lang/String;

    .line 205
    .line 206
    const-string v6, "brand"

    .line 207
    .line 208
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    iget-object v5, v3, Lcom/quago/mobile/sdk/d0;->d:Ljava/lang/String;

    .line 212
    .line 213
    const-string v6, "cpu_abi"

    .line 214
    .line 215
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    iget-object v5, v3, Lcom/quago/mobile/sdk/d0;->e:Ljava/lang/String;

    .line 219
    .line 220
    const-string v6, "cpu_abi2"

    .line 221
    .line 222
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    iget-object v5, v3, Lcom/quago/mobile/sdk/d0;->f:Ljava/lang/String;

    .line 226
    .line 227
    const-string v6, "device"

    .line 228
    .line 229
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    iget-object v5, v3, Lcom/quago/mobile/sdk/d0;->g:Ljava/lang/String;

    .line 233
    .line 234
    const-string v6, "display"

    .line 235
    .line 236
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    iget-object v5, v3, Lcom/quago/mobile/sdk/d0;->h:Ljava/lang/String;

    .line 240
    .line 241
    const-string v6, "fingerprint"

    .line 242
    .line 243
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    iget-object v5, v3, Lcom/quago/mobile/sdk/d0;->i:Ljava/lang/String;

    .line 247
    .line 248
    const-string v6, "hardware"

    .line 249
    .line 250
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    iget-object v5, v3, Lcom/quago/mobile/sdk/d0;->j:Ljava/lang/String;

    .line 254
    .line 255
    const-string v6, "host"

    .line 256
    .line 257
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    iget-object v5, v3, Lcom/quago/mobile/sdk/d0;->k:Ljava/lang/String;

    .line 261
    .line 262
    const-string v6, "id"

    .line 263
    .line 264
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    iget-object v5, v3, Lcom/quago/mobile/sdk/d0;->l:Ljava/lang/String;

    .line 268
    .line 269
    const-string v6, "manufacturer"

    .line 270
    .line 271
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    iget-object v5, v3, Lcom/quago/mobile/sdk/d0;->m:Ljava/lang/String;

    .line 275
    .line 276
    const-string v6, "model"

    .line 277
    .line 278
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    iget-object v5, v3, Lcom/quago/mobile/sdk/d0;->n:Ljava/lang/String;

    .line 282
    .line 283
    const-string v6, "product"

    .line 284
    .line 285
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    iget-object v5, v3, Lcom/quago/mobile/sdk/d0;->o:Ljava/lang/String;

    .line 289
    .line 290
    const-string v6, "radio"

    .line 291
    .line 292
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    iget-object v5, v3, Lcom/quago/mobile/sdk/d0;->p:Ljava/lang/String;

    .line 296
    .line 297
    const-string v6, "tags"

    .line 298
    .line 299
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    iget-object v5, v3, Lcom/quago/mobile/sdk/d0;->q:Ljava/lang/String;

    .line 303
    .line 304
    const-string v6, "type"

    .line 305
    .line 306
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    iget-object v5, v3, Lcom/quago/mobile/sdk/d0;->r:Ljava/lang/String;

    .line 310
    .line 311
    const-string v6, "user"

    .line 312
    .line 313
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    iget-object v5, v3, Lcom/quago/mobile/sdk/d0;->s:Ljava/util/ArrayList;

    .line 317
    .line 318
    const-string v6, "supported_32_bit_abis"

    .line 319
    .line 320
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    iget-object v5, v3, Lcom/quago/mobile/sdk/d0;->t:Ljava/util/ArrayList;

    .line 324
    .line 325
    const-string v6, "supported_64_bit_abis"

    .line 326
    .line 327
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    iget-object v5, v3, Lcom/quago/mobile/sdk/d0;->u:Ljava/util/ArrayList;

    .line 331
    .line 332
    const-string v6, "supported_abis"

    .line 333
    .line 334
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    iget-wide v5, v3, Lcom/quago/mobile/sdk/d0;->v:J

    .line 338
    .line 339
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    const-string v5, "time"

    .line 344
    .line 345
    invoke-virtual {v4, v5, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    const-string v3, "build"

    .line 349
    .line 350
    invoke-virtual {v2, v3, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    iget-object v3, v1, Lcom/quago/mobile/sdk/p0;->b:Lcom/quago/mobile/sdk/d1;

    .line 354
    .line 355
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    new-instance v4, Ljava/util/TreeMap;

    .line 359
    .line 360
    invoke-direct {v4}, Ljava/util/TreeMap;-><init>()V

    .line 361
    .line 362
    .line 363
    iget-object v5, v3, Lcom/quago/mobile/sdk/d1;->a:Ljava/lang/String;

    .line 364
    .line 365
    const-string v6, "base_os"

    .line 366
    .line 367
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    iget-object v5, v3, Lcom/quago/mobile/sdk/d1;->b:Ljava/lang/String;

    .line 371
    .line 372
    const-string v6, "codename"

    .line 373
    .line 374
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    iget-object v5, v3, Lcom/quago/mobile/sdk/d1;->c:Ljava/lang/String;

    .line 378
    .line 379
    const-string v6, "incremental"

    .line 380
    .line 381
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    iget-object v5, v3, Lcom/quago/mobile/sdk/d1;->d:Ljava/lang/String;

    .line 385
    .line 386
    const-string v6, "release"

    .line 387
    .line 388
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    iget-object v5, v3, Lcom/quago/mobile/sdk/d1;->e:Ljava/lang/String;

    .line 392
    .line 393
    const-string v6, "security_patch"

    .line 394
    .line 395
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    iget v5, v3, Lcom/quago/mobile/sdk/d1;->f:I

    .line 399
    .line 400
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 401
    .line 402
    .line 403
    move-result-object v5

    .line 404
    const-string v6, "preview_sdk_int"

    .line 405
    .line 406
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    iget v3, v3, Lcom/quago/mobile/sdk/d1;->g:I

    .line 410
    .line 411
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 412
    .line 413
    .line 414
    move-result-object v3

    .line 415
    const-string v5, "sdk_int"

    .line 416
    .line 417
    invoke-virtual {v4, v5, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    const-string v3, "version"

    .line 421
    .line 422
    invoke-virtual {v2, v3, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    iget-object v3, v1, Lcom/quago/mobile/sdk/p0;->c:Lcom/quago/mobile/sdk/z0;

    .line 426
    .line 427
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 428
    .line 429
    .line 430
    new-instance v4, Ljava/util/TreeMap;

    .line 431
    .line 432
    invoke-direct {v4}, Ljava/util/TreeMap;-><init>()V

    .line 433
    .line 434
    .line 435
    iget-object v5, v3, Lcom/quago/mobile/sdk/z0;->a:Ljava/lang/String;

    .line 436
    .line 437
    const-string v6, "android_id"

    .line 438
    .line 439
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    iget-object v5, v3, Lcom/quago/mobile/sdk/z0;->b:Ljava/lang/String;

    .line 443
    .line 444
    const-string v6, "bluetooth_on"

    .line 445
    .line 446
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    iget-boolean v3, v3, Lcom/quago/mobile/sdk/z0;->c:Z

    .line 450
    .line 451
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 452
    .line 453
    .line 454
    move-result-object v3

    .line 455
    const-string v5, "rooted"

    .line 456
    .line 457
    invoke-virtual {v4, v5, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    const-string v3, "security"

    .line 461
    .line 462
    invoke-virtual {v2, v3, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    iget-object v3, v1, Lcom/quago/mobile/sdk/p0;->d:Lcom/quago/mobile/sdk/h0;

    .line 466
    .line 467
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    new-instance v4, Ljava/util/TreeMap;

    .line 471
    .line 472
    invoke-direct {v4}, Ljava/util/TreeMap;-><init>()V

    .line 473
    .line 474
    .line 475
    iget-wide v5, v3, Lcom/quago/mobile/sdk/h0;->a:J

    .line 476
    .line 477
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 478
    .line 479
    .line 480
    move-result-object v5

    .line 481
    const-string v6, "flags"

    .line 482
    .line 483
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    iget v5, v3, Lcom/quago/mobile/sdk/h0;->b:I

    .line 487
    .line 488
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 489
    .line 490
    .line 491
    move-result-object v5

    .line 492
    const-string v6, "num_cores"

    .line 493
    .line 494
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    iget v5, v3, Lcom/quago/mobile/sdk/h0;->c:I

    .line 498
    .line 499
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 500
    .line 501
    .line 502
    move-result-object v5

    .line 503
    const-string v6, "elf_machine"

    .line 504
    .line 505
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    iget-object v5, v3, Lcom/quago/mobile/sdk/h0;->d:Ljava/lang/String;

    .line 509
    .line 510
    const-string v6, "jre_bitness"

    .line 511
    .line 512
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    iget-object v5, v3, Lcom/quago/mobile/sdk/h0;->e:Ljava/lang/String;

    .line 516
    .line 517
    const-string v6, "total_memory"

    .line 518
    .line 519
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    iget-object v5, v3, Lcom/quago/mobile/sdk/h0;->f:Ljava/lang/String;

    .line 523
    .line 524
    const-string v6, "cpu_vendor"

    .line 525
    .line 526
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    iget-object v5, v3, Lcom/quago/mobile/sdk/h0;->h:Ljava/lang/String;

    .line 530
    .line 531
    const-string v6, "gles_code"

    .line 532
    .line 533
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    iget-object v5, v3, Lcom/quago/mobile/sdk/h0;->i:Ljava/lang/String;

    .line 537
    .line 538
    const-string v6, "gles_vendor"

    .line 539
    .line 540
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    iget-object v5, v3, Lcom/quago/mobile/sdk/h0;->j:Ljava/lang/String;

    .line 544
    .line 545
    const-string v6, "gles_version"

    .line 546
    .line 547
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    iget-object v5, v3, Lcom/quago/mobile/sdk/h0;->k:Ljava/lang/String;

    .line 551
    .line 552
    const-string v6, "gles_renderer"

    .line 553
    .line 554
    invoke-virtual {v4, v6, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    iget-wide v5, v3, Lcom/quago/mobile/sdk/h0;->g:J

    .line 558
    .line 559
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 560
    .line 561
    .line 562
    move-result-object v3

    .line 563
    const-string v5, "duration_millis"

    .line 564
    .line 565
    invoke-virtual {v4, v5, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    const-string v3, "emulation"

    .line 569
    .line 570
    invoke-virtual {v2, v3, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    new-instance v3, Ljava/util/LinkedList;

    .line 574
    .line 575
    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    .line 576
    .line 577
    .line 578
    iget-object v4, v1, Lcom/quago/mobile/sdk/p0;->e:Ljava/util/LinkedList;

    .line 579
    .line 580
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 581
    .line 582
    .line 583
    move-result-object v4

    .line 584
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 585
    .line 586
    .line 587
    move-result v5

    .line 588
    if-eqz v5, :cond_0

    .line 589
    .line 590
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v5

    .line 594
    check-cast v5, Lcom/quago/mobile/sdk/i0;

    .line 595
    .line 596
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 597
    .line 598
    .line 599
    new-instance v6, Ljava/util/TreeMap;

    .line 600
    .line 601
    invoke-direct {v6}, Ljava/util/TreeMap;-><init>()V

    .line 602
    .line 603
    .line 604
    iget v7, v5, Lcom/quago/mobile/sdk/i0;->a:I

    .line 605
    .line 606
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 607
    .line 608
    .line 609
    move-result-object v7

    .line 610
    const-string v8, "device_id"

    .line 611
    .line 612
    invoke-virtual {v6, v8, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    iget v7, v5, Lcom/quago/mobile/sdk/i0;->b:I

    .line 616
    .line 617
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 618
    .line 619
    .line 620
    move-result-object v7

    .line 621
    const-string v8, "source"

    .line 622
    .line 623
    invoke-virtual {v6, v8, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    iget v7, v5, Lcom/quago/mobile/sdk/i0;->c:I

    .line 627
    .line 628
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 629
    .line 630
    .line 631
    move-result-object v7

    .line 632
    const-string v8, "keyboard_type"

    .line 633
    .line 634
    invoke-virtual {v6, v8, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    iget v7, v5, Lcom/quago/mobile/sdk/i0;->d:I

    .line 638
    .line 639
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 640
    .line 641
    .line 642
    move-result-object v7

    .line 643
    const-string v8, "vendor_id"

    .line 644
    .line 645
    invoke-virtual {v6, v8, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    iget v7, v5, Lcom/quago/mobile/sdk/i0;->e:I

    .line 649
    .line 650
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 651
    .line 652
    .line 653
    move-result-object v7

    .line 654
    const-string v8, "controller_num"

    .line 655
    .line 656
    invoke-virtual {v6, v8, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    iget v7, v5, Lcom/quago/mobile/sdk/i0;->f:I

    .line 660
    .line 661
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 662
    .line 663
    .line 664
    move-result-object v7

    .line 665
    const-string v8, "product_id"

    .line 666
    .line 667
    invoke-virtual {v6, v8, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    iget-object v7, v5, Lcom/quago/mobile/sdk/i0;->g:Ljava/lang/String;

    .line 671
    .line 672
    const-string v8, "name"

    .line 673
    .line 674
    invoke-virtual {v6, v8, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    iget-object v7, v5, Lcom/quago/mobile/sdk/i0;->h:Ljava/lang/Boolean;

    .line 678
    .line 679
    const-string v8, "virtual"

    .line 680
    .line 681
    invoke-virtual {v6, v8, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    iget-object v5, v5, Lcom/quago/mobile/sdk/i0;->i:Ljava/lang/Boolean;

    .line 685
    .line 686
    const-string v7, "external"

    .line 687
    .line 688
    invoke-virtual {v6, v7, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    invoke-virtual {v3, v6}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 692
    .line 693
    .line 694
    goto :goto_0

    .line 695
    :cond_0
    const-string v4, "input_devices"

    .line 696
    .line 697
    invoke-virtual {v2, v4, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    iget-object v3, v1, Lcom/quago/mobile/sdk/p0;->f:Ljava/util/LinkedList;

    .line 701
    .line 702
    const-string v4, "input_devices_motion"

    .line 703
    .line 704
    invoke-virtual {v2, v4, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    iget-object v1, v1, Lcom/quago/mobile/sdk/p0;->g:Ljava/util/LinkedList;

    .line 708
    .line 709
    const-string v3, "input_devices_keys"

    .line 710
    .line 711
    invoke-virtual {v2, v3, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    const-string v1, "meta_android"

    .line 715
    .line 716
    invoke-virtual {v0, v1, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->t:Lcom/quago/mobile/sdk/h1;

    .line 720
    .line 721
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 722
    .line 723
    .line 724
    new-instance v2, Ljava/util/TreeMap;

    .line 725
    .line 726
    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    .line 727
    .line 728
    .line 729
    iget-wide v3, v1, Lcom/quago/mobile/sdk/h1;->a:J

    .line 730
    .line 731
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 732
    .line 733
    .line 734
    move-result-object v3

    .line 735
    const-string v4, "ts_start"

    .line 736
    .line 737
    invoke-virtual {v2, v4, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    iget-wide v3, v1, Lcom/quago/mobile/sdk/h1;->b:J

    .line 741
    .line 742
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 743
    .line 744
    .line 745
    move-result-object v3

    .line 746
    const-string v4, "ts_end"

    .line 747
    .line 748
    invoke-virtual {v2, v4, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    iget-wide v3, v1, Lcom/quago/mobile/sdk/h1;->c:J

    .line 752
    .line 753
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 754
    .line 755
    .line 756
    move-result-object v3

    .line 757
    const-string v4, "uptime_start"

    .line 758
    .line 759
    invoke-virtual {v2, v4, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    iget-wide v3, v1, Lcom/quago/mobile/sdk/h1;->d:J

    .line 763
    .line 764
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 765
    .line 766
    .line 767
    move-result-object v3

    .line 768
    const-string v4, "uptime_end"

    .line 769
    .line 770
    invoke-virtual {v2, v4, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    iget-wide v3, v1, Lcom/quago/mobile/sdk/h1;->e:J

    .line 774
    .line 775
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 776
    .line 777
    .line 778
    move-result-object v1

    .line 779
    const-string v3, "ts_sdk_init"

    .line 780
    .line 781
    invoke-virtual {v2, v3, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    const-string v1, "times"

    .line 785
    .line 786
    invoke-virtual {v0, v1, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    iget v1, p0, Lcom/quago/mobile/sdk/l;->u:I

    .line 790
    .line 791
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 792
    .line 793
    .line 794
    move-result-object v1

    .line 795
    const-string v2, "screen_width"

    .line 796
    .line 797
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    iget v1, p0, Lcom/quago/mobile/sdk/l;->v:I

    .line 801
    .line 802
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 803
    .line 804
    .line 805
    move-result-object v1

    .line 806
    const-string v2, "screen_height"

    .line 807
    .line 808
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 809
    .line 810
    .line 811
    iget v1, p0, Lcom/quago/mobile/sdk/l;->w:I

    .line 812
    .line 813
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 814
    .line 815
    .line 816
    move-result-object v1

    .line 817
    const-string v2, "app_width"

    .line 818
    .line 819
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    iget v1, p0, Lcom/quago/mobile/sdk/l;->x:I

    .line 823
    .line 824
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 825
    .line 826
    .line 827
    move-result-object v1

    .line 828
    const-string v2, "app_height"

    .line 829
    .line 830
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 831
    .line 832
    .line 833
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->y:Lcom/quago/mobile/sdk/a;

    .line 834
    .line 835
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 836
    .line 837
    .line 838
    new-instance v2, Ljava/util/TreeMap;

    .line 839
    .line 840
    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    .line 841
    .line 842
    .line 843
    iget v3, v1, Lcom/quago/mobile/sdk/a;->a:F

    .line 844
    .line 845
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 846
    .line 847
    .line 848
    move-result-object v3

    .line 849
    const-string v4, "xdpi"

    .line 850
    .line 851
    invoke-virtual {v2, v4, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    iget v1, v1, Lcom/quago/mobile/sdk/a;->b:F

    .line 855
    .line 856
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 857
    .line 858
    .line 859
    move-result-object v1

    .line 860
    const-string v3, "ydpi"

    .line 861
    .line 862
    invoke-virtual {v2, v3, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 863
    .line 864
    .line 865
    const-string v1, "resolution_android"

    .line 866
    .line 867
    invoke-virtual {v0, v1, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 868
    .line 869
    .line 870
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->z:Ljava/util/ArrayList;

    .line 871
    .line 872
    const-string v2, "key_values"

    .line 873
    .line 874
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 875
    .line 876
    .line 877
    iget v1, p0, Lcom/quago/mobile/sdk/l;->A:I

    .line 878
    .line 879
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 880
    .line 881
    .line 882
    move-result-object v1

    .line 883
    const-string v2, "prompt"

    .line 884
    .line 885
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 886
    .line 887
    .line 888
    iget-boolean v1, p0, Lcom/quago/mobile/sdk/l;->B:Z

    .line 889
    .line 890
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 891
    .line 892
    .line 893
    move-result-object v1

    .line 894
    const-string v2, "is_new"

    .line 895
    .line 896
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 897
    .line 898
    .line 899
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->C:Ljava/util/LinkedList;

    .line 900
    .line 901
    const-string v2, "seq_life"

    .line 902
    .line 903
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 904
    .line 905
    .line 906
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->D:Ljava/util/LinkedList;

    .line 907
    .line 908
    const-string v2, "seq_motion"

    .line 909
    .line 910
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 911
    .line 912
    .line 913
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->E:Ljava/util/LinkedList;

    .line 914
    .line 915
    const-string v2, "seq_key"

    .line 916
    .line 917
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 918
    .line 919
    .line 920
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->F:Ljava/util/LinkedList;

    .line 921
    .line 922
    const-string v2, "seq_acc"

    .line 923
    .line 924
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 925
    .line 926
    .line 927
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->G:Ljava/util/LinkedList;

    .line 928
    .line 929
    const-string v2, "seq_mag"

    .line 930
    .line 931
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 932
    .line 933
    .line 934
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->H:Ljava/util/LinkedList;

    .line 935
    .line 936
    const-string v2, "seq_gyro"

    .line 937
    .line 938
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 939
    .line 940
    .line 941
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->I:Ljava/util/LinkedList;

    .line 942
    .line 943
    const-string v2, "seq_geomag"

    .line 944
    .line 945
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 946
    .line 947
    .line 948
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->J:Ljava/util/LinkedList;

    .line 949
    .line 950
    const-string v2, "seq_prox"

    .line 951
    .line 952
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 953
    .line 954
    .line 955
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->K:Ljava/util/LinkedList;

    .line 956
    .line 957
    const-string v2, "seq_light"

    .line 958
    .line 959
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 960
    .line 961
    .line 962
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->L:Ljava/util/LinkedList;

    .line 963
    .line 964
    const-string v2, "seq_pressure"

    .line 965
    .line 966
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 967
    .line 968
    .line 969
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->M:Ljava/util/LinkedList;

    .line 970
    .line 971
    const-string v2, "seq_temp"

    .line 972
    .line 973
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 974
    .line 975
    .line 976
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->N:Ljava/util/LinkedList;

    .line 977
    .line 978
    const-string v2, "seq_step"

    .line 979
    .line 980
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 981
    .line 982
    .line 983
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->O:Ljava/util/LinkedList;

    .line 984
    .line 985
    const-string v2, "seq_resolution"

    .line 986
    .line 987
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 988
    .line 989
    .line 990
    iget-object p0, p0, Lcom/quago/mobile/sdk/l;->P:Ljava/util/LinkedList;

    .line 991
    .line 992
    const-string v1, "seq_battery"

    .line 993
    .line 994
    invoke-virtual {v0, v1, p0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 995
    .line 996
    .line 997
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "name = "

    .line 2
    .line 3
    invoke-static {v0}, Len;->p(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->f:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v1, "\nappToken = "

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, "\nsessionId = "

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->h:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, "\nuserId = "

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->b:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, "\nmatchingId = "

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->c:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, "\nmapKeyValues = "

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->z:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, "\ntimes = "

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->t:Lcom/quago/mobile/sdk/h1;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v1, "\nplatform = 1\nindex = "

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    iget v1, p0, Lcom/quago/mobile/sdk/l;->m:I

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v1, "\nmode = "

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget v1, p0, Lcom/quago/mobile/sdk/l;->o:I

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v1, "\nflavor = "

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    iget v1, p0, Lcom/quago/mobile/sdk/l;->p:I

    .line 98
    .line 99
    invoke-static {v1}, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;->valueOf(I)Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v1, "\nindicator = "

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    iget-wide v1, p0, Lcom/quago/mobile/sdk/l;->q:J

    .line 112
    .line 113
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v1, "\nresolutionData = "

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->y:Lcom/quago/mobile/sdk/a;

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string v1, "\nmetaData = "

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->s:Lcom/quago/mobile/sdk/p0;

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const-string v1, "\nseq_life = "

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->C:Ljava/util/LinkedList;

    .line 142
    .line 143
    invoke-static {v0, v1}, Lcom/quago/mobile/sdk/l;->a(Ljava/lang/StringBuilder;Ljava/util/LinkedList;)V

    .line 144
    .line 145
    .line 146
    const-string v1, "seq_motion = "

    .line 147
    .line 148
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->D:Ljava/util/LinkedList;

    .line 152
    .line 153
    invoke-static {v0, v1}, Lcom/quago/mobile/sdk/l;->a(Ljava/lang/StringBuilder;Ljava/util/LinkedList;)V

    .line 154
    .line 155
    .line 156
    const-string v1, "seq_key = "

    .line 157
    .line 158
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->E:Ljava/util/LinkedList;

    .line 162
    .line 163
    invoke-static {v0, v1}, Lcom/quago/mobile/sdk/l;->a(Ljava/lang/StringBuilder;Ljava/util/LinkedList;)V

    .line 164
    .line 165
    .line 166
    const-string v1, "seq_acc = "

    .line 167
    .line 168
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->F:Ljava/util/LinkedList;

    .line 172
    .line 173
    invoke-static {v0, v1}, Lcom/quago/mobile/sdk/l;->a(Ljava/lang/StringBuilder;Ljava/util/LinkedList;)V

    .line 174
    .line 175
    .line 176
    const-string v1, "seq_mag = "

    .line 177
    .line 178
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->G:Ljava/util/LinkedList;

    .line 182
    .line 183
    invoke-static {v0, v1}, Lcom/quago/mobile/sdk/l;->a(Ljava/lang/StringBuilder;Ljava/util/LinkedList;)V

    .line 184
    .line 185
    .line 186
    const-string v1, "seq_gyro = "

    .line 187
    .line 188
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->H:Ljava/util/LinkedList;

    .line 192
    .line 193
    invoke-static {v0, v1}, Lcom/quago/mobile/sdk/l;->a(Ljava/lang/StringBuilder;Ljava/util/LinkedList;)V

    .line 194
    .line 195
    .line 196
    const-string v1, "Gseq_geomagRV = "

    .line 197
    .line 198
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->I:Ljava/util/LinkedList;

    .line 202
    .line 203
    invoke-static {v0, v1}, Lcom/quago/mobile/sdk/l;->a(Ljava/lang/StringBuilder;Ljava/util/LinkedList;)V

    .line 204
    .line 205
    .line 206
    const-string v1, "seq_prox = "

    .line 207
    .line 208
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->J:Ljava/util/LinkedList;

    .line 212
    .line 213
    invoke-static {v0, v1}, Lcom/quago/mobile/sdk/l;->a(Ljava/lang/StringBuilder;Ljava/util/LinkedList;)V

    .line 214
    .line 215
    .line 216
    const-string v1, "seq_light = "

    .line 217
    .line 218
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->K:Ljava/util/LinkedList;

    .line 222
    .line 223
    invoke-static {v0, v1}, Lcom/quago/mobile/sdk/l;->a(Ljava/lang/StringBuilder;Ljava/util/LinkedList;)V

    .line 224
    .line 225
    .line 226
    const-string v1, "seq_pressure = "

    .line 227
    .line 228
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->L:Ljava/util/LinkedList;

    .line 232
    .line 233
    invoke-static {v0, v1}, Lcom/quago/mobile/sdk/l;->a(Ljava/lang/StringBuilder;Ljava/util/LinkedList;)V

    .line 234
    .line 235
    .line 236
    const-string v1, "seq_temp = "

    .line 237
    .line 238
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->M:Ljava/util/LinkedList;

    .line 242
    .line 243
    invoke-static {v0, v1}, Lcom/quago/mobile/sdk/l;->a(Ljava/lang/StringBuilder;Ljava/util/LinkedList;)V

    .line 244
    .line 245
    .line 246
    const-string v1, "seq_step = "

    .line 247
    .line 248
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->N:Ljava/util/LinkedList;

    .line 252
    .line 253
    invoke-static {v0, v1}, Lcom/quago/mobile/sdk/l;->a(Ljava/lang/StringBuilder;Ljava/util/LinkedList;)V

    .line 254
    .line 255
    .line 256
    const-string v1, "seq_resolution = "

    .line 257
    .line 258
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    iget-object v1, p0, Lcom/quago/mobile/sdk/l;->O:Ljava/util/LinkedList;

    .line 262
    .line 263
    invoke-static {v0, v1}, Lcom/quago/mobile/sdk/l;->a(Ljava/lang/StringBuilder;Ljava/util/LinkedList;)V

    .line 264
    .line 265
    .line 266
    const-string v1, "Battery = "

    .line 267
    .line 268
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    iget-object p0, p0, Lcom/quago/mobile/sdk/l;->P:Ljava/util/LinkedList;

    .line 272
    .line 273
    invoke-static {v0, p0}, Lcom/quago/mobile/sdk/l;->a(Ljava/lang/StringBuilder;Ljava/util/LinkedList;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    return-object p0
.end method
