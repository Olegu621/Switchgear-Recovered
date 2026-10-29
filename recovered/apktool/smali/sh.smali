.class public final Lsh;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lsh;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lsh;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lsh;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p4, p0, Lsh;->d:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lsh;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x1

    .line 7
    iget-object v5, p0, Lsh;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v6, p0, Lsh;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object p0, p0, Lsh;->b:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p1, Lwu1;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    check-cast p0, La13;

    .line 22
    .line 23
    iget-object p0, p0, La13;->a:Lfb1;

    .line 24
    .line 25
    check-cast v6, Lbw1;

    .line 26
    .line 27
    iget-object v0, p1, Lwu1;->a:Lcw1;

    .line 28
    .line 29
    iget-object v0, v0, Lcw1;->b:Ldw1;

    .line 30
    .line 31
    if-nez v6, :cond_4

    .line 32
    .line 33
    iget-object v0, v0, Ldw1;->c:Ljw2;

    .line 34
    .line 35
    iget-object v0, v0, Ljw2;->a:Lfj0;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    if-eq v0, v4, :cond_2

    .line 44
    .line 45
    if-eq v0, v3, :cond_1

    .line 46
    .line 47
    if-ne v0, v2, :cond_0

    .line 48
    .line 49
    sget-object v0, Lbw1;->c:Lbw1;

    .line 50
    .line 51
    :goto_0
    move-object v6, v0

    .line 52
    goto :goto_1

    .line 53
    :cond_0
    invoke-static {}, Lds0;->b()V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_1
    sget-object v0, Lbw1;->d:Lbw1;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    sget-object v0, Lbw1;->a:Lbw1;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    sget-object v0, Lbw1;->b:Lbw1;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    :goto_1
    iget-object v0, p0, Lfb1;->S:Lhk2;

    .line 67
    .line 68
    invoke-virtual {v0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Lgv1;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget-object v0, v0, Lgv1;->b:Lod2;

    .line 78
    .line 79
    sget-object v1, Lfh2;->a:[Lfh2;

    .line 80
    .line 81
    const-string v1, "ui_variant"

    .line 82
    .line 83
    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v0, v1, v2}, Lod2;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    check-cast v5, Lsh;

    .line 91
    .line 92
    new-instance v0, Ltu1;

    .line 93
    .line 94
    iget-object p0, p0, Lfb1;->u:Lhk2;

    .line 95
    .line 96
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    check-cast p0, Lzt1;

    .line 101
    .line 102
    invoke-direct {v0, p1, p0}, Ltu1;-><init>(Lwu1;Lzt1;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5, v0}, Lsh;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 109
    .line 110
    :goto_2
    return-object v1

    .line 111
    :pswitch_0
    check-cast v6, Lra2;

    .line 112
    .line 113
    move-object v7, p1

    .line 114
    check-cast v7, Ltu1;

    .line 115
    .line 116
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    check-cast p0, Lpg3;

    .line 120
    .line 121
    if-nez p0, :cond_9

    .line 122
    .line 123
    iget-object p0, v7, Ltu1;->a:Lwu1;

    .line 124
    .line 125
    iget-object p0, p0, Lwu1;->a:Lcw1;

    .line 126
    .line 127
    iget-object p0, p0, Lcw1;->b:Ldw1;

    .line 128
    .line 129
    iget-object p0, p0, Ldw1;->c:Ljw2;

    .line 130
    .line 131
    iget-object p0, p0, Ljw2;->a:Lfj0;

    .line 132
    .line 133
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    if-eqz p0, :cond_8

    .line 141
    .line 142
    if-eq p0, v4, :cond_7

    .line 143
    .line 144
    if-eq p0, v3, :cond_6

    .line 145
    .line 146
    if-ne p0, v2, :cond_5

    .line 147
    .line 148
    new-instance p0, Lg03;

    .line 149
    .line 150
    sget-object p1, Lpt1;->b:Lpt1;

    .line 151
    .line 152
    invoke-direct {p0, p1}, Lg03;-><init>(Lpt1;)V

    .line 153
    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_5
    invoke-static {}, Lds0;->b()V

    .line 157
    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_6
    new-instance p0, Lg03;

    .line 161
    .line 162
    sget-object p1, Lpt1;->a:Lpt1;

    .line 163
    .line 164
    invoke-direct {p0, p1}, Lg03;-><init>(Lpt1;)V

    .line 165
    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_7
    sget-object p0, Lf03;->i:Lf03;

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_8
    sget-object p0, Lh03;->i:Lh03;

    .line 172
    .line 173
    :cond_9
    :goto_3
    iget-object p1, v6, Lra2;->d:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast p1, Ljava/lang/ref/WeakReference;

    .line 176
    .line 177
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    move-object v4, p1

    .line 182
    check-cast v4, Landroid/content/Context;

    .line 183
    .line 184
    if-eqz v4, :cond_b

    .line 185
    .line 186
    check-cast v5, Lu03;

    .line 187
    .line 188
    new-instance v2, Liz2;

    .line 189
    .line 190
    move-object v3, v6

    .line 191
    move-object v6, p0

    .line 192
    invoke-direct/range {v2 .. v7}, Liz2;-><init>(Lra2;Landroid/content/Context;Lu03;Lpg3;Ltu1;)V

    .line 193
    .line 194
    .line 195
    invoke-static {v4}, Lmn0;->u(Landroid/content/Context;)Z

    .line 196
    .line 197
    .line 198
    move-result p0

    .line 199
    if-eqz p0, :cond_a

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_a
    :try_start_0
    invoke-virtual {v2}, Liz2;->invoke()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 203
    .line 204
    .line 205
    :catch_0
    :cond_b
    :goto_4
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 206
    .line 207
    :goto_5
    return-object v1

    .line 208
    :pswitch_1
    check-cast p1, Ldw1;

    .line 209
    .line 210
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    check-cast p0, Lth;

    .line 214
    .line 215
    iget-object v0, p0, Lth;->h:Lx80;

    .line 216
    .line 217
    new-instance v1, Lrh;

    .line 218
    .line 219
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 220
    .line 221
    check-cast v5, Lk61;

    .line 222
    .line 223
    invoke-direct {v1, v6, v5, p0, p1}, Lrh;-><init>(Lkotlin/jvm/functions/Function1;Lk61;Lth;Ldw1;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0, v1}, Lx80;->c(Lkotlin/jvm/functions/Function0;)V

    .line 227
    .line 228
    .line 229
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 230
    .line 231
    return-object p0

    .line 232
    nop

    .line 233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
