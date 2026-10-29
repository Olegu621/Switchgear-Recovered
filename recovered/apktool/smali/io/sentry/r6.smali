.class public final Lio/sentry/r6;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/c0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "java.version"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "java.vendor"

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lio/sentry/r6;->a:Ljava/lang/String;

    .line 17
    .line 18
    iput-object v1, p0, Lio/sentry/r6;->b:Ljava/lang/String;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/q4;)V
    .locals 1

    .line 1
    iget-object p1, p1, Lio/sentry/q4;->b:Lio/sentry/protocol/e;

    .line 2
    .line 3
    invoke-virtual {p1}, Lio/sentry/protocol/e;->h()Lio/sentry/protocol/y;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lio/sentry/protocol/y;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lio/sentry/protocol/e;->t(Lio/sentry/protocol/y;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p1}, Lio/sentry/protocol/e;->h()Lio/sentry/protocol/y;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    iget-object v0, p1, Lio/sentry/protocol/y;->a:Ljava/lang/String;

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p1, Lio/sentry/protocol/y;->b:Ljava/lang/String;

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, Lio/sentry/r6;->b:Ljava/lang/String;

    .line 32
    .line 33
    iput-object v0, p1, Lio/sentry/protocol/y;->a:Ljava/lang/String;

    .line 34
    .line 35
    iget-object p0, p0, Lio/sentry/r6;->a:Ljava/lang/String;

    .line 36
    .line 37
    iput-object p0, p1, Lio/sentry/protocol/y;->b:Ljava/lang/String;

    .line 38
    .line 39
    :cond_1
    return-void
.end method

.method public final f(Lio/sentry/c5;Lio/sentry/i0;)Lio/sentry/c5;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/sentry/r6;->a(Lio/sentry/q4;)V

    .line 2
    .line 3
    .line 4
    return-object p1
.end method

.method public final g(Lio/sentry/protocol/f0;Lio/sentry/i0;)Lio/sentry/protocol/f0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/sentry/r6;->a(Lio/sentry/q4;)V

    .line 2
    .line 3
    .line 4
    return-object p1
.end method
