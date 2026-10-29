.class public final Ldf1;
.super Ljava/util/TimerTask;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lef1;Lf8;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ldf1;->a:I

    .line 3
    .line 4
    iput-object p1, p0, Ldf1;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Ldf1;->c:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lio/sentry/q;Ljava/util/ArrayList;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ldf1;->a:I

    .line 12
    iput-object p1, p0, Ldf1;->c:Ljava/lang/Object;

    iput-object p2, p0, Ldf1;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, Ldf1;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Ldf1;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Ldf1;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lio/sentry/l3;

    .line 16
    .line 17
    check-cast v1, Lio/sentry/q;

    .line 18
    .line 19
    iget-object v2, v1, Lio/sentry/q;->g:Lio/sentry/android/core/SentryAndroidOptions;

    .line 20
    .line 21
    invoke-virtual {v2}, Lio/sentry/m6;->getDateProvider()Lio/sentry/u4;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v2}, Lio/sentry/u4;->a()Lio/sentry/t4;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, Lio/sentry/t4;->d()J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    invoke-direct {v0, v2, v3}, Lio/sentry/l3;-><init>(J)V

    .line 34
    .line 35
    .line 36
    iget-object v2, v1, Lio/sentry/q;->d:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_0

    .line 47
    .line 48
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Lio/sentry/y0;

    .line 53
    .line 54
    invoke-interface {v3, v0}, Lio/sentry/y0;->a(Lio/sentry/l3;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    iget-object v2, v1, Lio/sentry/q;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_2

    .line 73
    .line 74
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    check-cast v3, Lio/sentry/p;

    .line 79
    .line 80
    iget-object v4, v3, Lio/sentry/p;->a:Ljava/util/ArrayList;

    .line 81
    .line 82
    iget-object v5, v3, Lio/sentry/p;->b:Lio/sentry/m1;

    .line 83
    .line 84
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    if-eqz v5, :cond_1

    .line 88
    .line 89
    iget-object v4, v3, Lio/sentry/p;->d:Lio/sentry/q;

    .line 90
    .line 91
    iget-object v4, v4, Lio/sentry/q;->g:Lio/sentry/android/core/SentryAndroidOptions;

    .line 92
    .line 93
    invoke-virtual {v4}, Lio/sentry/m6;->getDateProvider()Lio/sentry/u4;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-interface {v4}, Lio/sentry/u4;->a()Lio/sentry/t4;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v4}, Lio/sentry/t4;->d()J

    .line 102
    .line 103
    .line 104
    move-result-wide v6

    .line 105
    iget-wide v3, v3, Lio/sentry/p;->c:J

    .line 106
    .line 107
    const-wide v8, 0x6fc23ac00L

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    add-long/2addr v3, v8

    .line 113
    cmp-long v3, v6, v3

    .line 114
    .line 115
    if-lez v3, :cond_1

    .line 116
    .line 117
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_2
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-eqz v0, :cond_3

    .line 130
    .line 131
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    check-cast v0, Lio/sentry/m1;

    .line 136
    .line 137
    invoke-virtual {v1, v0}, Lio/sentry/q;->f(Lio/sentry/m1;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_3
    return-void

    .line 142
    :pswitch_0
    check-cast p0, Lef1;

    .line 143
    .line 144
    iget-object v0, p0, Lef1;->b:Ljava/lang/Boolean;

    .line 145
    .line 146
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 147
    .line 148
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-eqz v0, :cond_4

    .line 153
    .line 154
    iget v0, p0, Lef1;->c:I

    .line 155
    .line 156
    iget v3, p0, Lef1;->d:I

    .line 157
    .line 158
    if-ge v0, v3, :cond_6

    .line 159
    .line 160
    :cond_4
    iget-object v0, p0, Lef1;->b:Ljava/lang/Boolean;

    .line 161
    .line 162
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_5

    .line 167
    .line 168
    iget v0, p0, Lef1;->c:I

    .line 169
    .line 170
    add-int/lit8 v0, v0, 0x1

    .line 171
    .line 172
    iput v0, p0, Lef1;->c:I

    .line 173
    .line 174
    :cond_5
    check-cast v1, Lf8;

    .line 175
    .line 176
    invoke-virtual {v1}, Lf8;->invoke()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    :cond_6
    return-void

    .line 180
    nop

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
