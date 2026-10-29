.class public final Lio/sentry/metrics/d;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/metrics/a;
.implements Lio/sentry/metrics/b;


# static fields
.field public static final a:Lio/sentry/metrics/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/metrics/d;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/sentry/metrics/d;->a:Lio/sentry/metrics/d;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public b(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Lio/sentry/android/core/SentryAndroidOptions;Lu93;)Lio/sentry/metrics/a;
    .locals 0

    .line 1
    new-instance p0, Lio/sentry/metrics/c;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lio/sentry/metrics/c;-><init>(Lio/sentry/android/core/SentryAndroidOptions;Lu93;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
