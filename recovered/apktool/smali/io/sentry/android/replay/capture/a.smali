.class public final Lio/sentry/android/replay/capture/a;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lio/sentry/android/replay/capture/c;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/c;I)V
    .locals 0

    .line 1
    iput p4, p0, Lio/sentry/android/replay/capture/a;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lio/sentry/android/replay/capture/a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lio/sentry/android/replay/capture/a;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lio/sentry/android/replay/capture/a;->d:Lio/sentry/android/replay/capture/c;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lio/sentry/android/replay/capture/a;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/android/replay/capture/a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lio/sentry/android/replay/capture/a;->d:Lio/sentry/android/replay/capture/c;

    .line 6
    .line 7
    iget-object p0, p0, Lio/sentry/android/replay/capture/a;->c:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, v2, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/k;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const-string v1, "replay.screen-at-start"

    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {v0, v1, p0}, Lio/sentry/android/replay/k;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    check-cast p0, Ljava/util/Date;

    .line 29
    .line 30
    check-cast v1, Ljava/util/Date;

    .line 31
    .line 32
    iget-object v0, v2, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/k;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    if-nez p0, :cond_1

    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    .line 41
    .line 42
    .line 43
    move-result-wide v1

    .line 44
    invoke-static {v1, v2}, Lio/sentry/config/a;->q(J)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    :goto_0
    const-string v1, "segment.timestamp"

    .line 49
    .line 50
    invoke-virtual {v0, v1, p0}, Lio/sentry/android/replay/k;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_1
    check-cast p0, Lio/sentry/android/replay/x;

    .line 57
    .line 58
    check-cast v1, Lio/sentry/android/replay/x;

    .line 59
    .line 60
    if-nez p0, :cond_3

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    iget-object v0, v2, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/k;

    .line 64
    .line 65
    if-eqz v0, :cond_4

    .line 66
    .line 67
    iget v1, p0, Lio/sentry/android/replay/x;->b:I

    .line 68
    .line 69
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    const-string v3, "config.height"

    .line 74
    .line 75
    invoke-virtual {v0, v3, v1}, Lio/sentry/android/replay/k;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    iget-object v0, v2, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/k;

    .line 79
    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    iget v1, p0, Lio/sentry/android/replay/x;->a:I

    .line 83
    .line 84
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    const-string v3, "config.width"

    .line 89
    .line 90
    invoke-virtual {v0, v3, v1}, Lio/sentry/android/replay/k;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :cond_5
    iget-object v0, v2, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/k;

    .line 94
    .line 95
    if-eqz v0, :cond_6

    .line 96
    .line 97
    iget v1, p0, Lio/sentry/android/replay/x;->e:I

    .line 98
    .line 99
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    const-string v3, "config.frame-rate"

    .line 104
    .line 105
    invoke-virtual {v0, v3, v1}, Lio/sentry/android/replay/k;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    :cond_6
    iget-object v0, v2, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/k;

    .line 109
    .line 110
    if-eqz v0, :cond_7

    .line 111
    .line 112
    iget p0, p0, Lio/sentry/android/replay/x;->f:I

    .line 113
    .line 114
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    const-string v1, "config.bit-rate"

    .line 119
    .line 120
    invoke-virtual {v0, v1, p0}, Lio/sentry/android/replay/k;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    :cond_7
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object p0

    .line 126
    :pswitch_2
    iget-object v0, v2, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/k;

    .line 127
    .line 128
    if-eqz v0, :cond_8

    .line 129
    .line 130
    const-string v1, "replay.id"

    .line 131
    .line 132
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-virtual {v0, v1, p0}, Lio/sentry/android/replay/k;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    return-object p0

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
