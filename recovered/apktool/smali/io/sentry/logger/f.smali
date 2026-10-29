.class public final Lio/sentry/logger/f;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/logger/a;
.implements Lio/sentry/logger/b;
.implements Lio/sentry/logger/c;


# static fields
.field public static final a:Lio/sentry/logger/f;

.field public static final b:Lio/sentry/logger/f;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/logger/f;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/sentry/logger/f;->a:Lio/sentry/logger/f;

    .line 7
    .line 8
    new-instance v0, Lio/sentry/logger/f;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lio/sentry/logger/f;->b:Lio/sentry/logger/f;

    .line 14
    .line 15
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

.method public c(Lio/sentry/android/core/SentryAndroidOptions;Lu93;)Lio/sentry/logger/b;
    .locals 0

    .line 1
    new-instance p0, Lio/sentry/logger/e;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lio/sentry/logger/e;-><init>(Lio/sentry/android/core/SentryAndroidOptions;Lu93;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public d(Lio/sentry/o5;)V
    .locals 0

    .line 1
    return-void
.end method

.method public varargs e(Lio/sentry/q5;Lio/sentry/d;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method
