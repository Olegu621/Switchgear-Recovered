.class public final Luv2;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Llo0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Luv2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Luv2;->b:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Luv2;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Luv2;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v4, p1

    .line 9
    check-cast v4, Ljava/lang/String;

    .line 10
    .line 11
    check-cast p2, Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    check-cast p3, Lkotlin/jvm/functions/Function1;

    .line 14
    .line 15
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast p0, Lb5;

    .line 25
    .line 26
    iget-object p1, p0, Lb5;->b:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v3, p1

    .line 29
    check-cast v3, La13;

    .line 30
    .line 31
    new-instance p1, Llz;

    .line 32
    .line 33
    const/16 v0, 0xf

    .line 34
    .line 35
    invoke-direct {p1, v0, p0, p2}, Llz;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    new-instance p2, Loc;

    .line 39
    .line 40
    const/16 v0, 0x11

    .line 41
    .line 42
    invoke-direct {p2, v0, p0, p3}, Loc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object p0, v3, La13;->a:Lfb1;

    .line 46
    .line 47
    iget-object p3, p0, Lfb1;->U:Lhk2;

    .line 48
    .line 49
    invoke-virtual {p3}, Lhk2;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    move-object v2, p3

    .line 54
    check-cast v2, Ljc2;

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iget-object p3, v2, Ljc2;->e:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v4, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p3

    .line 65
    if-eqz p3, :cond_0

    .line 66
    .line 67
    invoke-virtual {p1}, Llz;->invoke()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    goto/16 :goto_2

    .line 71
    .line 72
    :cond_0
    iget-object p3, v2, Ljc2;->a:Lfb1;

    .line 73
    .line 74
    iget-object p3, p3, Lfb1;->F:Lhk2;

    .line 75
    .line 76
    invoke-virtual {p3}, Lhk2;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    check-cast p3, Lac2;

    .line 81
    .line 82
    iget-object p3, p3, Lac2;->c:Lk61;

    .line 83
    .line 84
    iget-object v0, p3, Lk61;->j:Lec;

    .line 85
    .line 86
    const/16 v1, 0xa

    .line 87
    .line 88
    if-eqz v0, :cond_1

    .line 89
    .line 90
    iget-object p3, v0, Lec;->c:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p3, Lcv1;

    .line 93
    .line 94
    iget-object p3, p3, Lcv1;->a:Ljava/util/List;

    .line 95
    .line 96
    new-instance v0, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-static {p3, v1}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 103
    .line 104
    .line 105
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object p3

    .line 109
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_3

    .line 114
    .line 115
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    check-cast v1, Lbv1;

    .line 120
    .line 121
    iget-object v1, v1, Lbv1;->a:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_1
    iget-object p3, p3, Lk61;->i:Lij;

    .line 128
    .line 129
    if-eqz p3, :cond_2

    .line 130
    .line 131
    iget-object p3, p3, Lij;->d:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast p3, Lcv1;

    .line 134
    .line 135
    iget-object p3, p3, Lcv1;->a:Ljava/util/List;

    .line 136
    .line 137
    new-instance v0, Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-static {p3, v1}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 144
    .line 145
    .line 146
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object p3

    .line 150
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_3

    .line 155
    .line 156
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    check-cast v1, Lbv1;

    .line 161
    .line 162
    iget-object v1, v1, Lbv1;->a:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_2
    sget-object v0, Lnd0;->a:Lnd0;

    .line 169
    .line 170
    :cond_3
    invoke-interface {v0, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result p3

    .line 174
    if-nez p3, :cond_4

    .line 175
    .line 176
    new-instance p0, Lkm;

    .line 177
    .line 178
    const-string p1, "Cannot change the language to \'"

    .line 179
    .line 180
    const-string p3, "\' as it is not supported by your configuration. Please add it to your configuration at: Configuration Section > Setup Tab > Language Settings"

    .line 181
    .line 182
    invoke-static {p1, v4, p3}, Lfm0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-direct {p0, p1}, Lvz2;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    new-instance p1, Ltz2;

    .line 190
    .line 191
    invoke-direct {p1, p0}, Ltz2;-><init>(Lvz2;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p2, p1}, Loc;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_4
    invoke-virtual {p0}, Lfb1;->b()Lx80;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    new-instance v1, Lzs;

    .line 203
    .line 204
    const/4 v6, 0x7

    .line 205
    const/4 v5, 0x0

    .line 206
    invoke-direct/range {v1 .. v6}, Lzs;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p0, v1}, Lx80;->b(Lkotlin/jvm/functions/Function2;)Lec;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    new-instance p3, Loc;

    .line 214
    .line 215
    const/16 v0, 0xb

    .line 216
    .line 217
    invoke-direct {p3, v0, v3, p1}, Loc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0, p3}, Lec;->H(Lkotlin/jvm/functions/Function1;)V

    .line 221
    .line 222
    .line 223
    new-instance p1, Loc;

    .line 224
    .line 225
    const/16 p3, 0xc

    .line 226
    .line 227
    invoke-direct {p1, p3, v3, p2}, Loc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0, p1}, Lec;->G(Lkotlin/jvm/functions/Function1;)V

    .line 231
    .line 232
    .line 233
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 234
    .line 235
    return-object p0

    .line 236
    :pswitch_0
    check-cast p1, Lcv2;

    .line 237
    .line 238
    check-cast p2, Lqv2;

    .line 239
    .line 240
    check-cast p3, Lnv2;

    .line 241
    .line 242
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    check-cast p0, Lwv2;

    .line 252
    .line 253
    invoke-static {p0}, Lwv2;->p(Lwv2;)Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    iget-object v1, p0, Lwv2;->d0:Lew2;

    .line 258
    .line 259
    invoke-virtual {v0, v1, p2}, Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;->k(Lew2;Lqv2;)V

    .line 260
    .line 261
    .line 262
    invoke-static {p0}, Lwv2;->o(Lwv2;)Lcom/usercentrics/sdk/ui/secondLayer/component/footer/UCSecondLayerFooter;

    .line 263
    .line 264
    .line 265
    move-result-object p2

    .line 266
    invoke-virtual {p2, p3}, Lcom/usercentrics/sdk/ui/secondLayer/component/footer/UCSecondLayerFooter;->k(Lnv2;)V

    .line 267
    .line 268
    .line 269
    invoke-static {p0, p1}, Lwv2;->l(Lwv2;Lcv2;)V

    .line 270
    .line 271
    .line 272
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 273
    .line 274
    return-object p0

    .line 275
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
