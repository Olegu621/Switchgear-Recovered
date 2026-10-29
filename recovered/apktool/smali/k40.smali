.class public final Lk40;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:Ldl1;

.field public final synthetic b:Le22;

.field public final synthetic c:Lh22;

.field public final synthetic d:Lb50;


# direct methods
.method public constructor <init>(Ldl1;Le22;Lh22;Lb50;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk40;->a:Ldl1;

    .line 5
    .line 6
    iput-object p2, p0, Lk40;->b:Le22;

    .line 7
    .line 8
    iput-object p3, p0, Lk40;->c:Lh22;

    .line 9
    .line 10
    iput-object p4, p0, Lk40;->d:Lb50;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Lg40;Ld10;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Lj40;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lj40;

    .line 7
    .line 8
    iget v1, v0, Lj40;->v:I

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
    iput v1, v0, Lj40;->v:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lj40;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lj40;-><init>(Lk40;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lj40;->f:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lj40;->v:I

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    const/4 v6, 0x0

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    if-eq v2, v5, :cond_3

    .line 38
    .line 39
    if-eq v2, v4, :cond_2

    .line 40
    .line 41
    if-ne v2, v3, :cond_1

    .line 42
    .line 43
    iget-object p0, v0, Lj40;->c:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object p1, v0, Lj40;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Lh22;

    .line 48
    .line 49
    iget-object v0, v0, Lj40;->a:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Ldl1;

    .line 52
    .line 53
    :try_start_0
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    goto/16 :goto_4

    .line 57
    .line 58
    :catchall_0
    move-exception p0

    .line 59
    goto/16 :goto_6

    .line 60
    .line 61
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v6

    .line 67
    :cond_2
    iget-object p0, v0, Lj40;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p0, Lb50;

    .line 70
    .line 71
    iget-object p1, v0, Lj40;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, Lh22;

    .line 74
    .line 75
    iget-object v2, v0, Lj40;->a:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v2, Ldl1;

    .line 78
    .line 79
    :try_start_1
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :catchall_1
    move-exception p0

    .line 84
    move-object v0, v2

    .line 85
    goto/16 :goto_6

    .line 86
    .line 87
    :cond_3
    iget-object p0, v0, Lj40;->e:Lb50;

    .line 88
    .line 89
    iget-object p1, v0, Lj40;->d:Lh22;

    .line 90
    .line 91
    iget-object v2, v0, Lj40;->c:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v2, Le22;

    .line 94
    .line 95
    iget-object v5, v0, Lj40;->b:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v5, Ldl1;

    .line 98
    .line 99
    iget-object v7, v0, Lj40;->a:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v7, Lkotlin/jvm/functions/Function2;

    .line 102
    .line 103
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    move-object p2, v7

    .line 107
    move-object v7, p1

    .line 108
    move-object p1, p2

    .line 109
    move-object p2, v5

    .line 110
    goto :goto_1

    .line 111
    :cond_4
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    iput-object p1, v0, Lj40;->a:Ljava/lang/Object;

    .line 115
    .line 116
    iget-object p2, p0, Lk40;->a:Ldl1;

    .line 117
    .line 118
    iput-object p2, v0, Lj40;->b:Ljava/lang/Object;

    .line 119
    .line 120
    iget-object v2, p0, Lk40;->b:Le22;

    .line 121
    .line 122
    iput-object v2, v0, Lj40;->c:Ljava/lang/Object;

    .line 123
    .line 124
    iget-object v7, p0, Lk40;->c:Lh22;

    .line 125
    .line 126
    iput-object v7, v0, Lj40;->d:Lh22;

    .line 127
    .line 128
    iget-object p0, p0, Lk40;->d:Lb50;

    .line 129
    .line 130
    iput-object p0, v0, Lj40;->e:Lb50;

    .line 131
    .line 132
    iput v5, v0, Lj40;->v:I

    .line 133
    .line 134
    check-cast p2, Lgl1;

    .line 135
    .line 136
    invoke-virtual {p2, v0}, Lgl1;->d(Ld10;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    if-ne v5, v1, :cond_5

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_5
    :goto_1
    :try_start_2
    iget-boolean v2, v2, Le22;->a:Z

    .line 144
    .line 145
    if-nez v2, :cond_9

    .line 146
    .line 147
    iget-object v2, v7, Lh22;->a:Ljava/lang/Object;

    .line 148
    .line 149
    iput-object p2, v0, Lj40;->a:Ljava/lang/Object;

    .line 150
    .line 151
    iput-object v7, v0, Lj40;->b:Ljava/lang/Object;

    .line 152
    .line 153
    iput-object p0, v0, Lj40;->c:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object v6, v0, Lj40;->d:Lh22;

    .line 156
    .line 157
    iput-object v6, v0, Lj40;->e:Lb50;

    .line 158
    .line 159
    iput v4, v0, Lj40;->v:I

    .line 160
    .line 161
    invoke-interface {p1, v2, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 165
    if-ne p1, v1, :cond_6

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_6
    move-object v2, p2

    .line 169
    move-object p2, p1

    .line 170
    move-object p1, v7

    .line 171
    :goto_2
    :try_start_3
    iget-object v4, p1, Lh22;->a:Ljava/lang/Object;

    .line 172
    .line 173
    invoke-static {p2, v4}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    if-nez v4, :cond_8

    .line 178
    .line 179
    iput-object v2, v0, Lj40;->a:Ljava/lang/Object;

    .line 180
    .line 181
    iput-object p1, v0, Lj40;->b:Ljava/lang/Object;

    .line 182
    .line 183
    iput-object p2, v0, Lj40;->c:Ljava/lang/Object;

    .line 184
    .line 185
    iput v3, v0, Lj40;->v:I

    .line 186
    .line 187
    const/4 v3, 0x0

    .line 188
    invoke-virtual {p0, p2, v3, v0}, Lb50;->j(Ljava/lang/Object;ZLd10;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 192
    if-ne p0, v1, :cond_7

    .line 193
    .line 194
    :goto_3
    return-object v1

    .line 195
    :cond_7
    move-object p0, p2

    .line 196
    move-object v0, v2

    .line 197
    :goto_4
    :try_start_4
    iput-object p0, p1, Lh22;->a:Ljava/lang/Object;

    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_8
    move-object v0, v2

    .line 201
    :goto_5
    iget-object p0, p1, Lh22;->a:Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 202
    .line 203
    check-cast v0, Lgl1;

    .line 204
    .line 205
    invoke-virtual {v0, v6}, Lgl1;->g(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    return-object p0

    .line 209
    :catchall_2
    move-exception p0

    .line 210
    move-object v0, p2

    .line 211
    goto :goto_6

    .line 212
    :cond_9
    :try_start_5
    const-string p0, "InitializerApi.updateData should not be called after initialization is complete."

    .line 213
    .line 214
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 215
    .line 216
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 220
    :goto_6
    check-cast v0, Lgl1;

    .line 221
    .line 222
    invoke-virtual {v0, v6}, Lgl1;->g(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    throw p0
.end method
