.class public final Lio/sentry/android/core/r;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/android/core/internal/util/q;


# instance fields
.field public a:F

.field public final synthetic b:Lio/sentry/android/core/t;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/android/core/r;->b:Lio/sentry/android/core/t;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput p1, p0, Lio/sentry/android/core/r;->a:F

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final b(JJJJZZF)V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 6
    .line 7
    .line 8
    const-wide/32 p7, 0xf4240

    .line 9
    .line 10
    .line 11
    mul-long/2addr p1, p7

    .line 12
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 13
    .line 14
    .line 15
    move-result-wide p7

    .line 16
    sub-long/2addr p3, p7

    .line 17
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 18
    .line 19
    .line 20
    move-result-wide p7

    .line 21
    add-long/2addr p7, p3

    .line 22
    iget-object p3, p0, Lio/sentry/android/core/r;->b:Lio/sentry/android/core/t;

    .line 23
    .line 24
    iget-wide v0, p3, Lio/sentry/android/core/t;->a:J

    .line 25
    .line 26
    sub-long/2addr p7, v0

    .line 27
    const-wide/16 v0, 0x0

    .line 28
    .line 29
    cmp-long p4, p7, v0

    .line 30
    .line 31
    if-gez p4, :cond_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    if-eqz p10, :cond_1

    .line 35
    .line 36
    iget-object p4, p3, Lio/sentry/android/core/t;->j:Ljava/util/ArrayDeque;

    .line 37
    .line 38
    new-instance p9, Lio/sentry/profilemeasurements/b;

    .line 39
    .line 40
    invoke-static {p7, p8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object p10

    .line 44
    invoke-static {p5, p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 45
    .line 46
    .line 47
    move-result-object p5

    .line 48
    invoke-direct {p9, p10, p5, p1, p2}, Lio/sentry/profilemeasurements/b;-><init>(Ljava/lang/Long;Ljava/lang/Number;J)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p4, p9}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    if-eqz p9, :cond_2

    .line 56
    .line 57
    iget-object p4, p3, Lio/sentry/android/core/t;->i:Ljava/util/ArrayDeque;

    .line 58
    .line 59
    new-instance p9, Lio/sentry/profilemeasurements/b;

    .line 60
    .line 61
    invoke-static {p7, p8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 62
    .line 63
    .line 64
    move-result-object p10

    .line 65
    invoke-static {p5, p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    .line 67
    .line 68
    move-result-object p5

    .line 69
    invoke-direct {p9, p10, p5, p1, p2}, Lio/sentry/profilemeasurements/b;-><init>(Ljava/lang/Long;Ljava/lang/Number;J)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p4, p9}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    :goto_0
    iget p4, p0, Lio/sentry/android/core/r;->a:F

    .line 76
    .line 77
    cmpl-float p4, p11, p4

    .line 78
    .line 79
    if-eqz p4, :cond_3

    .line 80
    .line 81
    iput p11, p0, Lio/sentry/android/core/r;->a:F

    .line 82
    .line 83
    iget-object p0, p3, Lio/sentry/android/core/t;->h:Ljava/util/ArrayDeque;

    .line 84
    .line 85
    new-instance p3, Lio/sentry/profilemeasurements/b;

    .line 86
    .line 87
    invoke-static {p7, p8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 88
    .line 89
    .line 90
    move-result-object p4

    .line 91
    invoke-static {p11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 92
    .line 93
    .line 94
    move-result-object p5

    .line 95
    invoke-direct {p3, p4, p5, p1, p2}, Lio/sentry/profilemeasurements/b;-><init>(Ljava/lang/Long;Ljava/lang/Number;J)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, p3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_3
    :goto_1
    return-void
.end method
