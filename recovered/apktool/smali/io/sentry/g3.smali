.class public final Lio/sentry/g3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/o1;


# static fields
.field public static final a:Lio/sentry/g3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/g3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/sentry/g3;->a:Lio/sentry/g3;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final o(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/internal/debugmeta/c;)Lio/sentry/transport/g;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/transport/j;->a:Lio/sentry/transport/j;

    .line 2
    .line 3
    return-object p0
.end method
