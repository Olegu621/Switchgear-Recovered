.class public final Ljt1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:Liy;

.field public b:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public c:Lub0;

.field public d:Lnm;

.field public e:Z

.field public f:Z


# virtual methods
.method public final a(I)V
    .locals 7

    .line 1
    iget-object v0, p0, Ljt1;->d:Lnm;

    .line 2
    .line 3
    iget-boolean v1, p0, Ljt1;->f:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "PolerCntlr"

    .line 7
    .line 8
    if-nez v1, :cond_8

    .line 9
    .line 10
    invoke-virtual {v0}, Lnm;->p()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_8

    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    if-ne p1, v1, :cond_0

    .line 18
    .line 19
    goto/16 :goto_3

    .line 20
    .line 21
    :cond_0
    const/16 v4, 0x1388

    .line 22
    .line 23
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    const-string v5, "base_polling_interval"

    .line 28
    .line 29
    invoke-virtual {v0, v4, v5}, Lnm;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    const v5, 0xea60

    .line 40
    .line 41
    .line 42
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    const-string v6, "max_polling_interval"

    .line 47
    .line 48
    invoke-virtual {v0, v5, v6}, Lnm;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Ljava/lang/Integer;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v5, p0, Ljt1;->c:Lub0;

    .line 59
    .line 60
    iget v6, v5, Lub0;->a:I

    .line 61
    .line 62
    if-ne v6, v4, :cond_1

    .line 63
    .line 64
    iget v6, v5, Lub0;->b:I

    .line 65
    .line 66
    if-ne v6, v0, :cond_1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    iput v4, v5, Lub0;->a:I

    .line 70
    .line 71
    iput v0, v5, Lub0;->b:I

    .line 72
    .line 73
    iput v4, v5, Lub0;->c:I

    .line 74
    .line 75
    :goto_0
    if-nez p1, :cond_2

    .line 76
    .line 77
    iget p1, v5, Lub0;->c:I

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    const/16 v0, 0xc8

    .line 81
    .line 82
    if-lt p1, v0, :cond_3

    .line 83
    .line 84
    const/16 v0, 0x190

    .line 85
    .line 86
    if-lt p1, v0, :cond_4

    .line 87
    .line 88
    :cond_3
    const/16 v0, 0x1f4

    .line 89
    .line 90
    if-lt p1, v0, :cond_6

    .line 91
    .line 92
    :cond_4
    iget p1, v5, Lub0;->c:I

    .line 93
    .line 94
    mul-int/lit8 p1, p1, 0x2

    .line 95
    .line 96
    iget v0, v5, Lub0;->b:I

    .line 97
    .line 98
    if-le p1, v0, :cond_5

    .line 99
    .line 100
    move p1, v0

    .line 101
    :cond_5
    iput p1, v5, Lub0;->c:I

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_6
    iput v1, v5, Lub0;->c:I

    .line 105
    .line 106
    :goto_1
    iget p1, v5, Lub0;->c:I

    .line 107
    .line 108
    :goto_2
    if-ne p1, v1, :cond_7

    .line 109
    .line 110
    const-string p0, "Stopping poller, request failed"

    .line 111
    .line 112
    invoke-static {v3, p0, v2}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    const-string v1, "Scheduling next poll with interval: "

    .line 119
    .line 120
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v3, v0, v2}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 131
    .line 132
    .line 133
    :try_start_0
    iget-object v0, p0, Ljt1;->b:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 134
    .line 135
    new-instance v1, Lf62;

    .line 136
    .line 137
    new-instance v2, Lye;

    .line 138
    .line 139
    const/16 v4, 0x13

    .line 140
    .line 141
    invoke-direct {v2, p0, v4}, Lye;-><init>(Ljava/lang/Object;I)V

    .line 142
    .line 143
    .line 144
    const/4 p0, 0x1

    .line 145
    invoke-direct {v1, v2, p0}, Lf62;-><init>(Ljava/lang/Runnable;I)V

    .line 146
    .line 147
    .line 148
    int-to-long p0, p1

    .line 149
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 150
    .line 151
    invoke-virtual {v0, v1, p0, p1, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :catch_0
    move-exception p0

    .line 156
    const-string p1, "Error in scheduling next poll"

    .line 157
    .line 158
    invoke-static {v3, p1, p0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :cond_8
    :goto_3
    const-string p0, "Stopping poller, shouldPoll is false or STOP_POLLING received."

    .line 163
    .line 164
    invoke-static {v3, p0, v2}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 165
    .line 166
    .line 167
    return-void
.end method
