.class public Lcom/supercell/titan/SentryTitan;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/supercell/titan/SentryTitan$EventAttachment;,
        Lcom/supercell/titan/SentryTitan$EventBytesAttachment;,
        Lcom/supercell/titan/SentryTitan$EventFileAttachment;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/Random;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/Random;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/supercell/titan/SentryTitan;->a:Ljava/util/Random;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v1, Lio/sentry/i0;

    .line 9
    .line 10
    invoke-direct {v1}, Lio/sentry/i0;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, p0, v1}, Lio/sentry/c1;->x(Ljava/lang/Exception;Lio/sentry/i0;)Lio/sentry/protocol/w;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static addEvent(Ljava/lang/String;Lp92;Ljava/lang/Exception;[Lcom/supercell/titan/SentryTitan$EventAttachment;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/c5;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-direct {v0, p2}, Lio/sentry/c5;-><init>(Ljava/lang/Exception;)V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-direct {v0}, Lio/sentry/c5;-><init>()V

    .line 10
    .line 11
    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-nez p2, :cond_1

    .line 19
    .line 20
    new-instance p2, Lio/sentry/protocol/p;

    .line 21
    .line 22
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p0, p2, Lio/sentry/protocol/p;->b:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p2, v0, Lio/sentry/c5;->b0:Lio/sentry/protocol/p;

    .line 28
    .line 29
    :cond_1
    iget-object p0, p1, Lp92;->a:Lio/sentry/m5;

    .line 30
    .line 31
    iput-object p0, v0, Lio/sentry/c5;->f0:Lio/sentry/m5;

    .line 32
    .line 33
    if-eqz p4, :cond_2

    .line 34
    .line 35
    invoke-virtual {p4}, Ljava/lang/String;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-nez p0, :cond_2

    .line 40
    .line 41
    filled-new-array {p4}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    new-instance p1, Ljava/util/ArrayList;

    .line 46
    .line 47
    const/4 p2, 0x1

    .line 48
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 49
    .line 50
    .line 51
    const/4 p2, 0x0

    .line 52
    aget-object p0, p0, p2

    .line 53
    .line 54
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {v0, p0}, Lio/sentry/c5;->h(Ljava/util/List;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    new-instance p0, Lpn;

    .line 68
    .line 69
    const/16 p1, 0xe

    .line 70
    .line 71
    invoke-direct {p0, p1, p3, v0}, Lpn;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-static {p0}, Lio/sentry/m4;->h(Lpn;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public static b(Ljava/lang/String;)V
    .locals 3

    .line 1
    const v0, 0xc0

    const-string v0, "WARNING: "

    .line 2
    .line 3
    invoke-static {v0, p0}, Len;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v0, Lp92;->b:Lp92;

    .line 8
    .line 9
    new-instance v1, Lio/sentry/c5;

    .line 10
    .line 11
    invoke-direct {v1}, Lio/sentry/c5;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v2, Lio/sentry/protocol/p;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p0, v2, Lio/sentry/protocol/p;->a:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p0, v2, Lio/sentry/protocol/p;->b:Ljava/lang/String;

    .line 22
    .line 23
    iput-object v2, v1, Lio/sentry/c5;->b0:Lio/sentry/protocol/p;

    .line 24
    .line 25
    iget-object v0, v0, Lp92;->a:Lio/sentry/m5;

    .line 26
    .line 27
    iput-object v0, v1, Lio/sentry/c5;->f0:Lio/sentry/m5;

    .line 28
    .line 29
    new-instance v0, Ljava/util/ArrayList;

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v0}, Lio/sentry/c5;->h(Ljava/util/List;)V

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    new-instance v0, Lio/sentry/i0;

    .line 49
    .line 50
    invoke-direct {v0}, Lio/sentry/i0;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-interface {p0, v1, v0}, Lio/sentry/c1;->B(Lio/sentry/c5;Lio/sentry/i0;)Lio/sentry/protocol/w;

    .line 54
    .line 55
    .line 56
    return-void
.end method
