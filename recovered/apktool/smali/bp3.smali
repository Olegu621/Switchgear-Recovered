.class public final Lbp3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lyh3;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lmp3;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lmp3;Ljava/lang/String;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lbp3;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lbp3;->b:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lbp3;->d:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p1, p0, Lbp3;->c:Lmp3;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 7

    .line 1
    iget p1, p0, Lbp3;->a:I

    .line 2
    .line 3
    iget-object p5, p0, Lbp3;->d:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p5, Lpp3;

    .line 9
    .line 10
    iget-wide v0, p5, Lpp3;->a:J

    .line 11
    .line 12
    iget-object p1, p0, Lbp3;->c:Lmp3;

    .line 13
    .line 14
    invoke-virtual {p1}, Lmp3;->b()Lbj3;

    .line 15
    .line 16
    .line 17
    move-result-object p5

    .line 18
    invoke-virtual {p5}, Lbj3;->y()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lmp3;->k0()V

    .line 22
    .line 23
    .line 24
    const/4 p5, 0x0

    .line 25
    if-nez p4, :cond_0

    .line 26
    .line 27
    :try_start_0
    new-array p4, p5, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    move-object p0, v0

    .line 32
    goto/16 :goto_2

    .line 33
    .line 34
    :cond_0
    :goto_0
    const/16 v2, 0xc8

    .line 35
    .line 36
    iget-object p0, p0, Lbp3;->b:Ljava/lang/String;

    .line 37
    .line 38
    if-eq p2, v2, :cond_1

    .line 39
    .line 40
    const/16 v2, 0xcc

    .line 41
    .line 42
    if-ne p2, v2, :cond_3

    .line 43
    .line 44
    move p2, v2

    .line 45
    :cond_1
    if-nez p3, :cond_3

    .line 46
    .line 47
    :try_start_1
    iget-object p3, p1, Lmp3;->c:Lae3;

    .line 48
    .line 49
    invoke-static {p3}, Lmp3;->S(Lwo3;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 53
    .line 54
    .line 55
    move-result-object p4

    .line 56
    invoke-virtual {p3, p4}, Lae3;->G(Ljava/lang/Long;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Lmp3;->a()Luh3;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    iget-object p3, p3, Luh3;->Y:Lsh3;

    .line 64
    .line 65
    const-string p4, "Successfully uploaded batch from upload queue. appId, status"

    .line 66
    .line 67
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-virtual {p3, p0, p4, p2}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object p2, p1, Lmp3;->b:Lci3;

    .line 75
    .line 76
    invoke-static {p2}, Lmp3;->S(Lwo3;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2}, Lci3;->T()Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-eqz p2, :cond_2

    .line 84
    .line 85
    iget-object p2, p1, Lmp3;->c:Lae3;

    .line 86
    .line 87
    invoke-static {p2}, Lmp3;->S(Lwo3;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2, p0}, Lae3;->F(Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    if-eqz p2, :cond_2

    .line 95
    .line 96
    invoke-virtual {p1, p0}, Lmp3;->t(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_2
    invoke-virtual {p1}, Lmp3;->L()V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_3
    new-instance v2, Ljava/lang/String;

    .line 105
    .line 106
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 107
    .line 108
    invoke-direct {v2, p4, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 112
    .line 113
    .line 114
    move-result p4

    .line 115
    const/16 v3, 0x20

    .line 116
    .line 117
    invoke-static {v3, p4}, Ljava/lang/Math;->min(II)I

    .line 118
    .line 119
    .line 120
    move-result p4

    .line 121
    invoke-virtual {v2, p5, p4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p4

    .line 125
    invoke-virtual {p1}, Lmp3;->a()Luh3;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    iget-object v2, v2, Luh3;->V:Lsh3;

    .line 130
    .line 131
    const-string v3, "Network upload failed. Will retry later. appId, status, error"

    .line 132
    .line 133
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    if-nez p3, :cond_4

    .line 138
    .line 139
    move-object p3, p4

    .line 140
    :cond_4
    invoke-virtual {v2, v3, p0, p2, p3}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    iget-object p0, p1, Lmp3;->c:Lae3;

    .line 144
    .line 145
    invoke-static {p0}, Lmp3;->S(Lwo3;)V

    .line 146
    .line 147
    .line 148
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    invoke-virtual {p0, p2}, Lae3;->L(Ljava/lang/Long;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1}, Lmp3;->L()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 156
    .line 157
    .line 158
    :goto_1
    iput-boolean p5, p1, Lmp3;->f0:Z

    .line 159
    .line 160
    invoke-virtual {p1}, Lmp3;->M()V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :goto_2
    iput-boolean p5, p1, Lmp3;->f0:Z

    .line 165
    .line 166
    invoke-virtual {p1}, Lmp3;->M()V

    .line 167
    .line 168
    .line 169
    throw p0

    .line 170
    :pswitch_0
    iget-object v5, p0, Lbp3;->b:Ljava/lang/String;

    .line 171
    .line 172
    move-object v6, p5

    .line 173
    check-cast v6, Ljava/util/ArrayList;

    .line 174
    .line 175
    iget-object v0, p0, Lbp3;->c:Lmp3;

    .line 176
    .line 177
    const/4 v1, 0x1

    .line 178
    move v2, p2

    .line 179
    move-object v3, p3

    .line 180
    move-object v4, p4

    .line 181
    invoke-virtual/range {v0 .. v6}, Lmp3;->x(ZILjava/lang/Throwable;[BLjava/lang/String;Ljava/util/List;)V

    .line 182
    .line 183
    .line 184
    return-void

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
