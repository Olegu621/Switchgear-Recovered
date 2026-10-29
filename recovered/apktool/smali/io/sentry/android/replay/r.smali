.class public final Lio/sentry/android/replay/r;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public volatile a:Lio/sentry/android/replay/s;


# virtual methods
.method public final a(Lio/sentry/android/replay/s;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lio/sentry/android/replay/r;->a:Lio/sentry/android/replay/s;

    .line 5
    .line 6
    sget-object v0, Lio/sentry/android/replay/q;->a:[I

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    aget p0, v0, p0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    const/4 v1, 0x0

    .line 16
    packed-switch p0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lds0;->b()V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return p0

    .line 24
    :pswitch_0
    return v1

    .line 25
    :pswitch_1
    sget-object p0, Lio/sentry/android/replay/s;->STARTED:Lio/sentry/android/replay/s;

    .line 26
    .line 27
    if-eq p1, p0, :cond_1

    .line 28
    .line 29
    sget-object p0, Lio/sentry/android/replay/s;->CLOSED:Lio/sentry/android/replay/s;

    .line 30
    .line 31
    if-ne p1, p0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return v1

    .line 35
    :cond_1
    :goto_0
    return v0

    .line 36
    :pswitch_2
    sget-object p0, Lio/sentry/android/replay/s;->RESUMED:Lio/sentry/android/replay/s;

    .line 37
    .line 38
    if-eq p1, p0, :cond_3

    .line 39
    .line 40
    sget-object p0, Lio/sentry/android/replay/s;->STOPPED:Lio/sentry/android/replay/s;

    .line 41
    .line 42
    if-eq p1, p0, :cond_3

    .line 43
    .line 44
    sget-object p0, Lio/sentry/android/replay/s;->CLOSED:Lio/sentry/android/replay/s;

    .line 45
    .line 46
    if-ne p1, p0, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    return v1

    .line 50
    :cond_3
    :goto_1
    return v0

    .line 51
    :pswitch_3
    sget-object p0, Lio/sentry/android/replay/s;->PAUSED:Lio/sentry/android/replay/s;

    .line 52
    .line 53
    if-eq p1, p0, :cond_5

    .line 54
    .line 55
    sget-object p0, Lio/sentry/android/replay/s;->STOPPED:Lio/sentry/android/replay/s;

    .line 56
    .line 57
    if-eq p1, p0, :cond_5

    .line 58
    .line 59
    sget-object p0, Lio/sentry/android/replay/s;->CLOSED:Lio/sentry/android/replay/s;

    .line 60
    .line 61
    if-ne p1, p0, :cond_4

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_4
    return v1

    .line 65
    :cond_5
    :goto_2
    return v0

    .line 66
    :pswitch_4
    sget-object p0, Lio/sentry/android/replay/s;->PAUSED:Lio/sentry/android/replay/s;

    .line 67
    .line 68
    if-eq p1, p0, :cond_7

    .line 69
    .line 70
    sget-object p0, Lio/sentry/android/replay/s;->STOPPED:Lio/sentry/android/replay/s;

    .line 71
    .line 72
    if-eq p1, p0, :cond_7

    .line 73
    .line 74
    sget-object p0, Lio/sentry/android/replay/s;->CLOSED:Lio/sentry/android/replay/s;

    .line 75
    .line 76
    if-ne p1, p0, :cond_6

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_6
    return v1

    .line 80
    :cond_7
    :goto_3
    return v0

    .line 81
    :pswitch_5
    sget-object p0, Lio/sentry/android/replay/s;->STARTED:Lio/sentry/android/replay/s;

    .line 82
    .line 83
    if-eq p1, p0, :cond_9

    .line 84
    .line 85
    sget-object p0, Lio/sentry/android/replay/s;->CLOSED:Lio/sentry/android/replay/s;

    .line 86
    .line 87
    if-ne p1, p0, :cond_8

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_8
    return v1

    .line 91
    :cond_9
    :goto_4
    return v0

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
