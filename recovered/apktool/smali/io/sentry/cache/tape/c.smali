.class public final Lio/sentry/cache/tape/c;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final a:Lio/sentry/cache/tape/h;

.field public final synthetic b:Lio/sentry/cache/tape/d;


# direct methods
.method public constructor <init>(Lio/sentry/cache/tape/d;Lio/sentry/cache/tape/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/cache/tape/c;->b:Lio/sentry/cache/tape/d;

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/cache/tape/c;->a:Lio/sentry/cache/tape/h;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/cache/tape/c;->a:Lio/sentry/cache/tape/h;

    .line 2
    .line 3
    invoke-virtual {p0}, Lio/sentry/cache/tape/h;->hasNext()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/cache/tape/c;->a:Lio/sentry/cache/tape/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/cache/tape/h;->next()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [B

    .line 8
    .line 9
    iget-object p0, p0, Lio/sentry/cache/tape/c;->b:Lio/sentry/cache/tape/d;

    .line 10
    .line 11
    iget-object p0, p0, Lio/sentry/cache/tape/d;->c:Lio/sentry/cache/tape/e;

    .line 12
    .line 13
    invoke-interface {p0, v0}, Lio/sentry/cache/tape/e;->d([B)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final remove()V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/cache/tape/c;->a:Lio/sentry/cache/tape/h;

    .line 2
    .line 3
    invoke-virtual {p0}, Lio/sentry/cache/tape/h;->remove()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
