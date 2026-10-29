.class public final Lvc3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:Lof3;


# direct methods
.method public synthetic constructor <init>(Lof3;Ljava/lang/String;JI)V
    .locals 0

    .line 1
    iput p5, p0, Lvc3;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lvc3;->b:Ljava/lang/String;

    .line 4
    .line 5
    iput-wide p3, p0, Lvc3;->c:J

    .line 6
    .line 7
    iput-object p1, p0, Lvc3;->d:Lof3;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, Lvc3;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-wide v2, p0, Lvc3;->c:J

    .line 5
    .line 6
    iget-object v4, p0, Lvc3;->b:Ljava/lang/String;

    .line 7
    .line 8
    iget-object p0, p0, Lvc3;->d:Lof3;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Leg3;->y()V

    .line 14
    .line 15
    .line 16
    invoke-static {v4}, Lkb1;->k(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lof3;->c:Lid;

    .line 20
    .line 21
    invoke-virtual {v0, v4, v1}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    check-cast v5, Ljava/lang/Integer;

    .line 26
    .line 27
    iget-object v6, p0, Lsq3;->a:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v6, Lij3;

    .line 30
    .line 31
    if-eqz v5, :cond_3

    .line 32
    .line 33
    iget-object v7, v6, Lij3;->W:Llm3;

    .line 34
    .line 35
    iget-object v6, v6, Lij3;->f:Luh3;

    .line 36
    .line 37
    invoke-static {v7}, Lij3;->k(Lwg3;)V

    .line 38
    .line 39
    .line 40
    const/4 v8, 0x0

    .line 41
    invoke-virtual {v7, v8}, Llm3;->F(Z)Lbm3;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    add-int/lit8 v5, v5, -0x1

    .line 50
    .line 51
    if-nez v5, :cond_2

    .line 52
    .line 53
    invoke-virtual {v0, v4}, Lle2;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    iget-object v5, p0, Lof3;->b:Lid;

    .line 57
    .line 58
    invoke-virtual {v5, v4, v1}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Ljava/lang/Long;

    .line 63
    .line 64
    if-nez v1, :cond_0

    .line 65
    .line 66
    invoke-static {v6}, Lij3;->l(Lhk3;)V

    .line 67
    .line 68
    .line 69
    iget-object v1, v6, Luh3;->f:Lsh3;

    .line 70
    .line 71
    const-string v4, "First ad unit exposure time was never set"

    .line 72
    .line 73
    invoke-virtual {v1, v4}, Lsh3;->a(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 78
    .line 79
    .line 80
    move-result-wide v8

    .line 81
    sub-long v8, v2, v8

    .line 82
    .line 83
    invoke-virtual {v5, v4}, Lle2;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v4, v8, v9, v7}, Lof3;->E(Ljava/lang/String;JLbm3;)V

    .line 87
    .line 88
    .line 89
    :goto_0
    invoke-virtual {v0}, Lle2;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_4

    .line 94
    .line 95
    iget-wide v0, p0, Lof3;->d:J

    .line 96
    .line 97
    const-wide/16 v4, 0x0

    .line 98
    .line 99
    cmp-long v8, v0, v4

    .line 100
    .line 101
    if-nez v8, :cond_1

    .line 102
    .line 103
    invoke-static {v6}, Lij3;->l(Lhk3;)V

    .line 104
    .line 105
    .line 106
    iget-object p0, v6, Luh3;->f:Lsh3;

    .line 107
    .line 108
    const-string v0, "First ad exposure time was never set"

    .line 109
    .line 110
    invoke-virtual {p0, v0}, Lsh3;->a(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_1
    sub-long/2addr v2, v0

    .line 115
    invoke-virtual {p0, v2, v3, v7}, Lof3;->D(JLbm3;)V

    .line 116
    .line 117
    .line 118
    iput-wide v4, p0, Lof3;->d:J

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_2
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-virtual {v0, v4, p0}, Lle2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_3
    iget-object p0, v6, Lij3;->f:Luh3;

    .line 130
    .line 131
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 132
    .line 133
    .line 134
    iget-object p0, p0, Luh3;->f:Lsh3;

    .line 135
    .line 136
    const-string v0, "Call to endAdUnitExposure for unknown ad unit id"

    .line 137
    .line 138
    invoke-virtual {p0, v4, v0}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    :cond_4
    :goto_1
    return-void

    .line 142
    :pswitch_0
    invoke-virtual {p0}, Leg3;->y()V

    .line 143
    .line 144
    .line 145
    invoke-static {v4}, Lkb1;->k(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    iget-object v0, p0, Lof3;->c:Lid;

    .line 149
    .line 150
    invoke-virtual {v0}, Lle2;->isEmpty()Z

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    if-eqz v5, :cond_5

    .line 155
    .line 156
    iput-wide v2, p0, Lof3;->d:J

    .line 157
    .line 158
    :cond_5
    invoke-virtual {v0, v4, v1}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    check-cast v1, Ljava/lang/Integer;

    .line 163
    .line 164
    const/4 v5, 0x1

    .line 165
    if-eqz v1, :cond_6

    .line 166
    .line 167
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 168
    .line 169
    .line 170
    move-result p0

    .line 171
    add-int/2addr p0, v5

    .line 172
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-virtual {v0, v4, p0}, Lle2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_6
    iget v1, v0, Lle2;->c:I

    .line 181
    .line 182
    const/16 v6, 0x64

    .line 183
    .line 184
    if-lt v1, v6, :cond_7

    .line 185
    .line 186
    iget-object p0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast p0, Lij3;

    .line 189
    .line 190
    iget-object p0, p0, Lij3;->f:Luh3;

    .line 191
    .line 192
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 193
    .line 194
    .line 195
    iget-object p0, p0, Luh3;->w:Lsh3;

    .line 196
    .line 197
    const-string v0, "Too many ads visible"

    .line 198
    .line 199
    invoke-virtual {p0, v0}, Lsh3;->a(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_7
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-virtual {v0, v4, v1}, Lle2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    iget-object p0, p0, Lof3;->b:Lid;

    .line 211
    .line 212
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-virtual {p0, v4, v0}, Lle2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    :goto_2
    return-void

    .line 220
    nop

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
