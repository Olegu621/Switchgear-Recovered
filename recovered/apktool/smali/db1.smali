.class public final Ldb1;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lfb1;

.field public final synthetic c:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lfb1;Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p3, p0, Ldb1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ldb1;->b:Lfb1;

    .line 4
    .line 5
    iput-object p2, p0, Ldb1;->c:Landroid/content/Context;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ldb1;->a:I

    .line 4
    .line 5
    iget-object v2, v0, Ldb1;->c:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v0, v0, Ldb1;->b:Lfb1;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v1, Lts0;

    .line 13
    .line 14
    iget-object v3, v0, Lfb1;->R:Lhk2;

    .line 15
    .line 16
    invoke-virtual {v3}, Lhk2;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, Lil1;

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v3, v1, Lts0;->a:Ljava/lang/Object;

    .line 29
    .line 30
    new-instance v3, Lnl1;

    .line 31
    .line 32
    iget-object v4, v0, Lfb1;->S:Lhk2;

    .line 33
    .line 34
    invoke-virtual {v4}, Lhk2;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Lgv1;

    .line 39
    .line 40
    iget-object v0, v0, Lfb1;->a:Lcom/usercentrics/sdk/UsercentricsOptions;

    .line 41
    .line 42
    invoke-direct {v3, v2, v1, v4, v0}, Lnl1;-><init>(Landroid/content/Context;Lts0;Lgv1;Lcom/usercentrics/sdk/UsercentricsOptions;)V

    .line 43
    .line 44
    .line 45
    return-object v3

    .line 46
    :pswitch_0
    invoke-virtual {v0}, Lfb1;->e()Li03;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    new-instance v3, Lbg1;

    .line 54
    .line 55
    new-instance v4, Lri0;

    .line 56
    .line 57
    invoke-direct {v4, v1}, Lri0;-><init>(Li03;)V

    .line 58
    .line 59
    .line 60
    new-instance v5, Lqi0;

    .line 61
    .line 62
    const-string v6, "Firebase Advertising"

    .line 63
    .line 64
    invoke-direct {v5, v6, v1}, Ldg1;-><init>(Ljava/lang/String;Li03;)V

    .line 65
    .line 66
    .line 67
    new-instance v6, Lac1;

    .line 68
    .line 69
    new-instance v7, Lqx2;

    .line 70
    .line 71
    invoke-direct {v7, v1, v2}, Lqx2;-><init>(Li03;Landroid/content/Context;)V

    .line 72
    .line 73
    .line 74
    new-instance v8, Lkotlin/Pair;

    .line 75
    .line 76
    const-string v9, "hpb62D82I"

    .line 77
    .line 78
    invoke-direct {v8, v9, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    new-instance v7, Lgc;

    .line 82
    .line 83
    invoke-direct {v7, v1, v2}, Lgc;-><init>(Li03;Landroid/content/Context;)V

    .line 84
    .line 85
    .line 86
    new-instance v9, Lkotlin/Pair;

    .line 87
    .line 88
    const-string v10, "fHczTMzX8"

    .line 89
    .line 90
    invoke-direct {v9, v10, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    new-instance v7, Lxz0;

    .line 94
    .line 95
    invoke-direct {v7, v1}, Lxz0;-><init>(Li03;)V

    .line 96
    .line 97
    .line 98
    new-instance v10, Lkotlin/Pair;

    .line 99
    .line 100
    const-string v11, "9dchbL797"

    .line 101
    .line 102
    invoke-direct {v10, v11, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    new-instance v11, Lkotlin/Pair;

    .line 106
    .line 107
    const-string v7, "diWdt4yLB"

    .line 108
    .line 109
    invoke-direct {v11, v7, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    new-instance v12, Lkotlin/Pair;

    .line 113
    .line 114
    const-string v7, "GqhZxB-iiydzEk"

    .line 115
    .line 116
    invoke-direct {v12, v7, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    new-instance v7, Le20;

    .line 120
    .line 121
    invoke-direct {v7, v1}, Le20;-><init>(Li03;)V

    .line 122
    .line 123
    .line 124
    new-instance v13, Lkotlin/Pair;

    .line 125
    .line 126
    const-string v14, "cE0B0wy4Z"

    .line 127
    .line 128
    invoke-direct {v13, v14, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    new-instance v7, Lut;

    .line 132
    .line 133
    invoke-direct {v7, v1, v2}, Lut;-><init>(Li03;Landroid/content/Context;)V

    .line 134
    .line 135
    .line 136
    new-instance v14, Lkotlin/Pair;

    .line 137
    .line 138
    const-string v2, "IEbRp3saT"

    .line 139
    .line 140
    invoke-direct {v14, v2, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    new-instance v2, Lse2;

    .line 144
    .line 145
    invoke-direct {v2, v1}, Lse2;-><init>(Li03;)V

    .line 146
    .line 147
    .line 148
    new-instance v15, Lkotlin/Pair;

    .line 149
    .line 150
    const-string v7, "OxsYgtMfe7aP8u"

    .line 151
    .line 152
    invoke-direct {v15, v7, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    new-instance v2, Luc;

    .line 156
    .line 157
    invoke-direct {v2, v1}, Luc;-><init>(Li03;)V

    .line 158
    .line 159
    .line 160
    new-instance v7, Lkotlin/Pair;

    .line 161
    .line 162
    move-object/from16 p0, v0

    .line 163
    .line 164
    const-string v0, "Gx9iMF__f"

    .line 165
    .line 166
    invoke-direct {v7, v0, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    new-instance v0, Lg7;

    .line 170
    .line 171
    invoke-direct {v0, v1}, Lg7;-><init>(Li03;)V

    .line 172
    .line 173
    .line 174
    new-instance v2, Lkotlin/Pair;

    .line 175
    .line 176
    move-object/from16 v18, v4

    .line 177
    .line 178
    const-string v4, "1k_ljMZc28DDOc"

    .line 179
    .line 180
    invoke-direct {v2, v4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    move-object/from16 v17, v2

    .line 184
    .line 185
    move-object/from16 v16, v7

    .line 186
    .line 187
    filled-new-array/range {v8 .. v17}, [Lkotlin/Pair;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-static {v0}, Loc1;->e([Lkotlin/Pair;)Ljava/util/Map;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    const/4 v2, 0x2

    .line 196
    new-array v2, v2, [Ldg1;

    .line 197
    .line 198
    const/4 v4, 0x0

    .line 199
    aput-object v18, v2, v4

    .line 200
    .line 201
    const/4 v4, 0x1

    .line 202
    aput-object v5, v2, v4

    .line 203
    .line 204
    invoke-static {v2}, Lpw;->e([Ljava/lang/Object;)Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    new-instance v4, Lec;

    .line 209
    .line 210
    new-instance v5, La4;

    .line 211
    .line 212
    invoke-direct {v5, v1}, La4;-><init>(Li03;)V

    .line 213
    .line 214
    .line 215
    invoke-direct {v4, v1, v5}, Lec;-><init>(Li03;La4;)V

    .line 216
    .line 217
    .line 218
    invoke-direct {v6, v0, v2, v4}, Lac1;-><init>(Ljava/util/Map;Ljava/util/List;Lec;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {p0 .. p0}, Lfb1;->e()Li03;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-direct {v3, v6, v0}, Lbg1;-><init>(Lac1;Li03;)V

    .line 226
    .line 227
    .line 228
    return-object v3

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
