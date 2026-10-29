.class public final Lio/sentry/featureflags/c;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/featureflags/b;


# static fields
.field public static final a:Lio/sentry/featureflags/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/featureflags/c;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/sentry/featureflags/c;->a:Lio/sentry/featureflags/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 0

    .line 1
    return-void
.end method

.method public final clone()Lio/sentry/featureflags/b;
    .locals 0

    .line 4
    sget-object p0, Lio/sentry/featureflags/c;->a:Lio/sentry/featureflags/c;

    return-object p0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/featureflags/c;->a:Lio/sentry/featureflags/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h()Lio/sentry/protocol/j;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method
