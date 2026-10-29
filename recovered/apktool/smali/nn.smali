.class public final synthetic Lnn;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lxn;

.field public final synthetic c:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Lxn;Ljava/util/ArrayList;I)V
    .locals 0

    .line 1
    iput p3, p0, Lnn;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lnn;->b:Lxn;

    .line 4
    .line 5
    iput-object p2, p0, Lnn;->c:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Lnn;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lnn;->b:Lxn;

    .line 7
    .line 8
    iget-object p0, p0, Lnn;->c:Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v1, v0, Lxn;->i:Ljn;

    .line 11
    .line 12
    :try_start_0
    invoke-virtual {v0, p0}, Lxn;->G(Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljn;->i()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    invoke-virtual {v1}, Ljn;->i()V

    .line 21
    .line 22
    .line 23
    throw p0

    .line 24
    :pswitch_0
    iget-object v0, p0, Lnn;->b:Lxn;

    .line 25
    .line 26
    iget-object p0, p0, Lnn;->c:Ljava/util/ArrayList;

    .line 27
    .line 28
    new-instance v1, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const/4 v2, 0x0

    .line 38
    move v3, v2

    .line 39
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    const/4 v5, 0x1

    .line 44
    if-eqz v4, :cond_1

    .line 45
    .line 46
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Ldf;

    .line 51
    .line 52
    iget-object v6, v0, Lxn;->a:Lfs0;

    .line 53
    .line 54
    iget-object v7, v4, Ldf;->a:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v6, v7}, Lfs0;->t(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-eqz v6, :cond_0

    .line 61
    .line 62
    iget-object v6, v0, Lxn;->a:Lfs0;

    .line 63
    .line 64
    iget-object v7, v4, Ldf;->a:Ljava/lang/String;

    .line 65
    .line 66
    iget-object v6, v6, Lfs0;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v6, Ljava/util/LinkedHashMap;

    .line 69
    .line 70
    invoke-interface {v6, v7}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    iget-object v6, v4, Ldf;->a:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    iget-object v4, v4, Ldf;->b:Ljava/lang/Class;

    .line 79
    .line 80
    const-class v6, Lvw1;

    .line 81
    .line 82
    if-ne v4, v6, :cond_0

    .line 83
    .line 84
    move v3, v5

    .line 85
    goto :goto_0

    .line 86
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-eqz p0, :cond_2

    .line 91
    .line 92
    goto/16 :goto_2

    .line 93
    .line 94
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const-string v4, "Use cases ["

    .line 97
    .line 98
    invoke-direct {p0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    const-string v4, ", "

    .line 102
    .line 103
    invoke-static {v4, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v1, "] now DETACHED for camera"

    .line 111
    .line 112
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {v0, p0}, Lxn;->s(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    if-eqz v3, :cond_3

    .line 123
    .line 124
    iget-object p0, v0, Lxn;->i:Ljn;

    .line 125
    .line 126
    iget-object p0, p0, Ljn;->h:Lfl0;

    .line 127
    .line 128
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    :cond_3
    invoke-virtual {v0}, Lxn;->o()V

    .line 132
    .line 133
    .line 134
    iget-object p0, v0, Lxn;->a:Lfs0;

    .line 135
    .line 136
    invoke-virtual {p0}, Lfs0;->o()Ljava/util/Collection;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    if-eqz p0, :cond_4

    .line 145
    .line 146
    iget-object p0, v0, Lxn;->i:Ljn;

    .line 147
    .line 148
    iget-object p0, p0, Ljn;->l:Lzr0;

    .line 149
    .line 150
    iput-boolean v2, p0, Lzr0;->a:Z

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_4
    invoke-virtual {v0}, Lxn;->K()V

    .line 154
    .line 155
    .line 156
    :goto_1
    iget-object p0, v0, Lxn;->a:Lfs0;

    .line 157
    .line 158
    invoke-virtual {p0}, Lfs0;->n()Ljava/util/Collection;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 163
    .line 164
    .line 165
    move-result p0

    .line 166
    if-eqz p0, :cond_8

    .line 167
    .line 168
    iget-object p0, v0, Lxn;->i:Ljn;

    .line 169
    .line 170
    invoke-virtual {p0}, Ljn;->i()V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, Lxn;->C()V

    .line 174
    .line 175
    .line 176
    iget-object p0, v0, Lxn;->i:Ljn;

    .line 177
    .line 178
    invoke-virtual {p0, v2}, Ljn;->m(Z)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0}, Lxn;->y()Lrr;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    iput-object p0, v0, Lxn;->W:Lrr;

    .line 186
    .line 187
    const-string p0, "Closing camera."

    .line 188
    .line 189
    invoke-virtual {v0, p0}, Lxn;->s(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    iget p0, v0, Lxn;->s0:I

    .line 193
    .line 194
    invoke-static {p0}, Len;->y(I)I

    .line 195
    .line 196
    .line 197
    move-result p0

    .line 198
    const/4 v1, 0x0

    .line 199
    const/4 v3, 0x5

    .line 200
    packed-switch p0, :pswitch_data_1

    .line 201
    .line 202
    .line 203
    :pswitch_1
    iget p0, v0, Lxn;->s0:I

    .line 204
    .line 205
    invoke-static {p0}, Len;->A(I)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    const-string v1, "close() ignored due to being in state: "

    .line 210
    .line 211
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    invoke-virtual {v0, p0}, Lxn;->s(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    goto :goto_2

    .line 219
    :pswitch_2
    invoke-virtual {v0, v3}, Lxn;->E(I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0}, Lxn;->p()V

    .line 223
    .line 224
    .line 225
    goto :goto_2

    .line 226
    :pswitch_3
    iget-object p0, v0, Lxn;->v:Lwn;

    .line 227
    .line 228
    invoke-virtual {p0}, Lwn;->a()Z

    .line 229
    .line 230
    .line 231
    move-result p0

    .line 232
    if-nez p0, :cond_5

    .line 233
    .line 234
    iget-object p0, v0, Lxn;->r0:Lcb;

    .line 235
    .line 236
    iget-object p0, p0, Lcb;->b:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast p0, Lec;

    .line 239
    .line 240
    if-eqz p0, :cond_6

    .line 241
    .line 242
    iget-object p0, p0, Lec;->c:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast p0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 245
    .line 246
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 247
    .line 248
    .line 249
    move-result p0

    .line 250
    if-nez p0, :cond_6

    .line 251
    .line 252
    :cond_5
    move v2, v5

    .line 253
    :cond_6
    iget-object p0, v0, Lxn;->r0:Lcb;

    .line 254
    .line 255
    invoke-virtual {p0}, Lcb;->l()V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0, v3}, Lxn;->E(I)V

    .line 259
    .line 260
    .line 261
    if-eqz v2, :cond_9

    .line 262
    .line 263
    iget-object p0, v0, Lxn;->X:Ljava/util/LinkedHashMap;

    .line 264
    .line 265
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 266
    .line 267
    .line 268
    move-result p0

    .line 269
    invoke-static {v1, p0}, Lde3;->j(Ljava/lang/String;Z)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0}, Lxn;->q()V

    .line 273
    .line 274
    .line 275
    goto :goto_2

    .line 276
    :pswitch_4
    iget-object p0, v0, Lxn;->U:Landroid/hardware/camera2/CameraDevice;

    .line 277
    .line 278
    if-nez p0, :cond_7

    .line 279
    .line 280
    move v2, v5

    .line 281
    :cond_7
    invoke-static {v1, v2}, Lde3;->j(Ljava/lang/String;Z)V

    .line 282
    .line 283
    .line 284
    const/4 p0, 0x3

    .line 285
    invoke-virtual {v0, p0}, Lxn;->E(I)V

    .line 286
    .line 287
    .line 288
    goto :goto_2

    .line 289
    :cond_8
    invoke-virtual {v0}, Lxn;->J()V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0}, Lxn;->C()V

    .line 293
    .line 294
    .line 295
    iget p0, v0, Lxn;->s0:I

    .line 296
    .line 297
    const/16 v1, 0x9

    .line 298
    .line 299
    if-ne p0, v1, :cond_9

    .line 300
    .line 301
    invoke-virtual {v0}, Lxn;->A()V

    .line 302
    .line 303
    .line 304
    :cond_9
    :goto_2
    return-void

    .line 305
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    :pswitch_data_1
    .packed-switch 0x3
        :pswitch_4
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method
