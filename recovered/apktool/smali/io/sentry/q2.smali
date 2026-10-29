.class public final Lio/sentry/q2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/v0;


# static fields
.field public static final b:Lio/sentry/q2;


# instance fields
.field public final a:Lio/sentry/m6;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/q2;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/q2;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/sentry/q2;->b:Lio/sentry/q2;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lio/sentry/m6;->empty()Lio/sentry/m6;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lio/sentry/q2;->a:Lio/sentry/m6;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final A(Lio/sentry/protocol/k;)Lio/sentry/protocol/w;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 2
    .line 3
    return-object p0
.end method

.method public final B(Lio/sentry/c5;Lio/sentry/i0;)Lio/sentry/protocol/w;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 2
    .line 3
    return-object p0
.end method

.method public final a(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final b(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public final c(Ljava/lang/Throwable;Lio/sentry/a7;Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final clone()Lio/sentry/v0;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/q2;->b:Lio/sentry/q2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 0

    .line 4
    sget-object p0, Lio/sentry/q2;->b:Lio/sentry/q2;

    return-object p0
.end method

.method public final d()Lio/sentry/transport/p;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final e()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final f(Lio/sentry/f;Lio/sentry/i0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final g()Lio/sentry/k1;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final h(Lio/sentry/internal/debugmeta/c;Lio/sentry/i0;)Lio/sentry/protocol/w;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 2
    .line 3
    return-object p0
.end method

.method public final i(Lio/sentry/f;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final isEnabled()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final j(Lio/sentry/o3;)Lio/sentry/protocol/w;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 2
    .line 3
    return-object p0
.end method

.method public final k(Lpn;)V
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/v2;->b:Lio/sentry/v2;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lpn;->e(Lio/sentry/a1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final l()Lio/sentry/m6;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/q2;->a:Lio/sentry/m6;

    .line 2
    .line 3
    return-object p0
.end method

.method public final m()Lio/sentry/m1;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final n()V
    .locals 0

    .line 1
    return-void
.end method

.method public final o()V
    .locals 0

    .line 1
    return-void
.end method

.method public final q(Lio/sentry/j7;Lio/sentry/k7;)Lio/sentry/m1;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/f3;->a:Lio/sentry/f3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final r(Lio/sentry/d4;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final s()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final t()Lio/sentry/logger/a;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/logger/f;->a:Lio/sentry/logger/f;

    .line 2
    .line 3
    return-object p0
.end method

.method public final u(Lio/sentry/o6;Lio/sentry/i0;)Lio/sentry/protocol/w;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 2
    .line 3
    return-object p0
.end method

.method public final v()Lio/sentry/a1;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/v2;->b:Lio/sentry/v2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final w()Lio/sentry/u0;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/l2;->c:Lio/sentry/l2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final x(Ljava/lang/Exception;Lio/sentry/i0;)Lio/sentry/protocol/w;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 2
    .line 3
    return-object p0
.end method

.method public final y(Lio/sentry/protocol/f0;Lio/sentry/h7;Lio/sentry/i0;Lio/sentry/r3;)Lio/sentry/protocol/w;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 2
    .line 3
    return-object p0
.end method

.method public final z(Ljava/lang/String;)Lio/sentry/c1;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/w2;->b:Lio/sentry/w2;

    .line 2
    .line 3
    return-object p0
.end method
