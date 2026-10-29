.class public final synthetic Lio/sentry/android/core/internal/util/o;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field public final synthetic a:Lio/sentry/android/core/internal/util/r;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/internal/util/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/android/core/internal/util/o;->a:Lio/sentry/android/core/internal/util/r;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lio/sentry/android/core/internal/util/o;->a:Lio/sentry/android/core/internal/util/r;

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/android/core/internal/util/r;->c:Lio/sentry/ILogger;

    .line 4
    .line 5
    sget-object p1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 6
    .line 7
    const-string v0, "Error during frames measurements."

    .line 8
    .line 9
    invoke-interface {p0, p1, v0, p2}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
