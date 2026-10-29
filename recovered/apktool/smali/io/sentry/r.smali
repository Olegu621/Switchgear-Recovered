.class public final Lio/sentry/r;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/h1;


# instance fields
.field public final a:Lio/sentry/c1;


# direct methods
.method public constructor <init>(Lio/sentry/c1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/r;->a:Lio/sentry/c1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/s;->a:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/r;->a:Lio/sentry/c1;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
