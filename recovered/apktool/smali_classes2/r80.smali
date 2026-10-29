.class public abstract Lr80;
.super Lsm2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public c:I


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    sget-object v2, Lym2;->g:Lvm2;

    .line 4
    .line 5
    invoke-direct {p0, v0, v1, v2}, Lsm2;-><init>(JLvm2;)V

    .line 6
    .line 7
    .line 8
    iput p1, p0, Lr80;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public abstract c(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V
.end method

.method public abstract e()Lc10;
.end method

.method public g(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 1

    .line 1
    instance-of p0, p1, Lnx;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lnx;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p1, v0

    .line 10
    :goto_0
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-object p0, p1, Lnx;->a:Ljava/lang/Throwable;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    return-object v0
.end method

.method public h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p1
.end method

.method public final i(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    if-eqz p1, :cond_1

    .line 7
    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    invoke-static {p1, p2}, Ljf0;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    :cond_1
    if-nez p1, :cond_2

    .line 14
    .line 15
    move-object p1, p2

    .line 16
    :cond_2
    new-instance p2, Lc20;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "Fatal exception in coroutines machinery for "

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ". Please read KDoc to \'handleFatalException\' method and report this incident to maintainers"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-direct {p2, v0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lr80;->e()Lc10;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-interface {p0}, Lc10;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p2, p0}, Lb40;->o(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public abstract j()Ljava/lang/Object;
.end method

.method public final run()V
    .locals 12

    .line 1
    iget-object v0, p0, Lsm2;->b:Lvm2;

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, Lr80;->e()Lc10;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast v1, Lp80;

    .line 11
    .line 12
    iget-object v2, v1, Lp80;->e:Ld10;

    .line 13
    .line 14
    iget-object v1, v1, Lp80;->i:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-interface {v2}, Lc10;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-static {v3, v1}, Lco2;->c(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    sget-object v4, Lco2;->a:Lr4;

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    if-eq v1, v4, :cond_0

    .line 28
    .line 29
    invoke-static {v2, v3, v1}, Lj13;->C(Lc10;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Lkx2;

    .line 30
    .line 31
    .line 32
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v1

    .line 35
    goto/16 :goto_6

    .line 36
    .line 37
    :cond_0
    move-object v4, v5

    .line 38
    :goto_0
    :try_start_1
    invoke-interface {v2}, Lc10;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-virtual {p0}, Lr80;->j()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-virtual {p0, v7}, Lr80;->g(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    if-nez v8, :cond_3

    .line 51
    .line 52
    iget v9, p0, Lr80;->c:I

    .line 53
    .line 54
    const/4 v10, 0x1

    .line 55
    if-eq v9, v10, :cond_2

    .line 56
    .line 57
    const/4 v11, 0x2

    .line 58
    if-ne v9, v11, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    const/4 v10, 0x0

    .line 62
    :cond_2
    :goto_1
    if-eqz v10, :cond_3

    .line 63
    .line 64
    sget-object v9, Lxt0;->w:Lxt0;

    .line 65
    .line 66
    invoke-interface {v6, v9}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    check-cast v6, Lh01;

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :catchall_1
    move-exception v2

    .line 74
    goto :goto_5

    .line 75
    :cond_3
    move-object v6, v5

    .line 76
    :goto_2
    if-eqz v6, :cond_4

    .line 77
    .line 78
    invoke-interface {v6}, Lh01;->isActive()Z

    .line 79
    .line 80
    .line 81
    move-result v9

    .line 82
    if-nez v9, :cond_4

    .line 83
    .line 84
    invoke-interface {v6}, Lh01;->getCancellationException()Ljava/util/concurrent/CancellationException;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    invoke-virtual {p0, v7, v6}, Lr80;->c(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V

    .line 89
    .line 90
    .line 91
    sget-object v7, Lo42;->b:Lm42;

    .line 92
    .line 93
    invoke-static {v6}, Lpg3;->e(Ljava/lang/Throwable;)Ln42;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    invoke-interface {v2, v6}, Lc10;->resumeWith(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_4
    if-eqz v8, :cond_5

    .line 102
    .line 103
    sget-object v6, Lo42;->b:Lm42;

    .line 104
    .line 105
    new-instance v6, Ln42;

    .line 106
    .line 107
    invoke-direct {v6, v8}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {v2, v6}, Lc10;->resumeWith(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_5
    sget-object v6, Lo42;->b:Lm42;

    .line 115
    .line 116
    invoke-virtual {p0, v7}, Lr80;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    invoke-interface {v2, v6}, Lc10;->resumeWith(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 121
    .line 122
    .line 123
    :goto_3
    if-eqz v4, :cond_6

    .line 124
    .line 125
    :try_start_2
    invoke-virtual {v4}, Lkx2;->X()Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-eqz v2, :cond_7

    .line 130
    .line 131
    :cond_6
    invoke-static {v3, v1}, Lco2;->a(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 132
    .line 133
    .line 134
    :cond_7
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :catchall_2
    move-exception v0

    .line 141
    sget-object v1, Lo42;->b:Lm42;

    .line 142
    .line 143
    new-instance v1, Ln42;

    .line 144
    .line 145
    invoke-direct {v1, v0}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    move-object v0, v1

    .line 149
    :goto_4
    invoke-static {v0}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {p0, v5, v0}, Lr80;->i(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 154
    .line 155
    .line 156
    goto :goto_8

    .line 157
    :goto_5
    if-eqz v4, :cond_8

    .line 158
    .line 159
    :try_start_4
    invoke-virtual {v4}, Lkx2;->X()Z

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    if-eqz v4, :cond_9

    .line 164
    .line 165
    :cond_8
    invoke-static {v3, v1}, Lco2;->a(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    :cond_9
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 169
    :goto_6
    :try_start_5
    sget-object v2, Lo42;->b:Lm42;

    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 175
    .line 176
    goto :goto_7

    .line 177
    :catchall_3
    move-exception v0

    .line 178
    sget-object v2, Lo42;->b:Lm42;

    .line 179
    .line 180
    new-instance v2, Ln42;

    .line 181
    .line 182
    invoke-direct {v2, v0}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 183
    .line 184
    .line 185
    move-object v0, v2

    .line 186
    :goto_7
    invoke-static {v0}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-virtual {p0, v1, v0}, Lr80;->i(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 191
    .line 192
    .line 193
    :goto_8
    return-void
.end method
