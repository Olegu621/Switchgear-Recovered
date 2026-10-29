.class public final enum Lp92;
.super Ljava/lang/Enum;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final enum b:Lp92;

.field public static final enum c:Lp92;

.field public static final synthetic d:[Lp92;


# instance fields
.field public final a:Lio/sentry/m5;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lp92;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const-string v3, "NONE"

    .line 6
    .line 7
    invoke-direct {v0, v3, v1, v2}, Lp92;-><init>(Ljava/lang/String;ILio/sentry/m5;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lp92;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    sget-object v3, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 14
    .line 15
    const-string v4, "DEBUG"

    .line 16
    .line 17
    invoke-direct {v1, v4, v2, v3}, Lp92;-><init>(Ljava/lang/String;ILio/sentry/m5;)V

    .line 18
    .line 19
    .line 20
    new-instance v2, Lp92;

    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    sget-object v4, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 24
    .line 25
    const-string v5, "INFO"

    .line 26
    .line 27
    invoke-direct {v2, v5, v3, v4}, Lp92;-><init>(Ljava/lang/String;ILio/sentry/m5;)V

    .line 28
    .line 29
    .line 30
    new-instance v3, Lp92;

    .line 31
    .line 32
    const/4 v4, 0x3

    .line 33
    sget-object v5, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 34
    .line 35
    const-string v6, "WARNING"

    .line 36
    .line 37
    invoke-direct {v3, v6, v4, v5}, Lp92;-><init>(Ljava/lang/String;ILio/sentry/m5;)V

    .line 38
    .line 39
    .line 40
    sput-object v3, Lp92;->b:Lp92;

    .line 41
    .line 42
    new-instance v4, Lp92;

    .line 43
    .line 44
    const/4 v5, 0x4

    .line 45
    sget-object v6, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 46
    .line 47
    const-string v7, "ERROR"

    .line 48
    .line 49
    invoke-direct {v4, v7, v5, v6}, Lp92;-><init>(Ljava/lang/String;ILio/sentry/m5;)V

    .line 50
    .line 51
    .line 52
    sput-object v4, Lp92;->c:Lp92;

    .line 53
    .line 54
    new-instance v5, Lp92;

    .line 55
    .line 56
    const/4 v6, 0x5

    .line 57
    sget-object v7, Lio/sentry/m5;->FATAL:Lio/sentry/m5;

    .line 58
    .line 59
    const-string v8, "FATAL"

    .line 60
    .line 61
    invoke-direct {v5, v8, v6, v7}, Lp92;-><init>(Ljava/lang/String;ILio/sentry/m5;)V

    .line 62
    .line 63
    .line 64
    filled-new-array/range {v0 .. v5}, [Lp92;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sput-object v0, Lp92;->d:[Lp92;

    .line 69
    .line 70
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILio/sentry/m5;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lp92;->a:Lio/sentry/m5;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lp92;
    .locals 1

    .line 1
    const-class v0, Lp92;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lp92;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lp92;
    .locals 1

    .line 1
    sget-object v0, Lp92;->d:[Lp92;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lp92;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lp92;

    .line 8
    .line 9
    return-object v0
.end method
