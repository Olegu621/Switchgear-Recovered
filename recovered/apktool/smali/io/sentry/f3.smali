.class public final Lio/sentry/f3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/m1;


# static fields
.field public static final a:Lio/sentry/f3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/f3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/sentry/f3;->a:Lio/sentry/f3;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Lio/sentry/h7;
    .locals 11

    .line 1
    new-instance v0, Lio/sentry/h7;

    .line 2
    .line 3
    sget-object v1, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 4
    .line 5
    const/4 v9, 0x0

    .line 6
    const/4 v10, 0x0

    .line 7
    const-string v2, ""

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    invoke-direct/range {v0 .. v10}, Lio/sentry/h7;-><init>(Lio/sentry/protocol/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/sentry/protocol/w;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final b()Lio/sentry/t6;
    .locals 3

    .line 1
    new-instance p0, Lio/sentry/t6;

    .line 2
    .line 3
    sget-object v0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 4
    .line 5
    sget-object v1, Lio/sentry/d7;->b:Lio/sentry/d7;

    .line 6
    .line 7
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-direct {p0, v0, v1, v2}, Lio/sentry/t6;-><init>(Lio/sentry/protocol/w;Lio/sentry/d7;Ljava/lang/Boolean;)V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final c(Ljava/lang/String;Lio/sentry/t4;Lio/sentry/r1;)Lio/sentry/k1;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/d3;->a:Lio/sentry/d3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final e(Lio/sentry/f7;ZLio/sentry/i0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final f(Lio/sentry/f7;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final g()Lio/sentry/protocol/w;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, ""

    .line 2
    .line 3
    return-object p0
.end method

.method public final getStatus()Lio/sentry/f7;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final h(Ljava/io/IOException;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final i()V
    .locals 0

    .line 1
    return-void
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final k()Lio/sentry/d;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final l()V
    .locals 0

    .line 1
    return-void
.end method

.method public final m()Lio/sentry/k1;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final n(Ljava/lang/String;Ljava/lang/String;Lio/sentry/t4;Lio/sentry/r1;Lio/sentry/e7;)Lio/sentry/k1;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/d3;->a:Lio/sentry/d3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final o(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final p(Ljava/lang/String;)Lio/sentry/k1;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/d3;->a:Lio/sentry/d3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final q()V
    .locals 0

    .line 1
    return-void
.end method

.method public final r(Ljava/lang/String;Ljava/lang/Long;Lio/sentry/j2;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final s()Lio/sentry/b7;
    .locals 4

    .line 1
    new-instance p0, Lio/sentry/b7;

    .line 2
    .line 3
    sget-object v0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 4
    .line 5
    sget-object v1, Lio/sentry/d7;->b:Lio/sentry/d7;

    .line 6
    .line 7
    const-string v2, "op"

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {p0, v0, v1, v2, v3}, Lio/sentry/b7;-><init>(Lio/sentry/protocol/w;Lio/sentry/d7;Ljava/lang/String;Lio/sentry/d7;)V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public final t()Lio/sentry/t4;
    .locals 0

    .line 1
    new-instance p0, Lio/sentry/u5;

    .line 2
    .line 3
    invoke-direct {p0}, Lio/sentry/u5;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final u(Ljava/lang/String;Ljava/lang/Number;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final v(Lio/sentry/f7;Lio/sentry/t4;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final w()Lio/sentry/t4;
    .locals 0

    .line 1
    new-instance p0, Lio/sentry/u5;

    .line 2
    .line 3
    invoke-direct {p0}, Lio/sentry/u5;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
