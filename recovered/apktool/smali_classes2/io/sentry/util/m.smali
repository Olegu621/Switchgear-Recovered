.class public abstract Lio/sentry/util/m;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final a:Lg5;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lg5;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lg5;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lio/sentry/util/m;->a:Lg5;

    .line 9
    .line 10
    return-void
.end method

.method public static a()Lio/sentry/util/l;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/util/m;->a:Lg5;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lio/sentry/util/l;

    .line 8
    .line 9
    return-object v0
.end method
