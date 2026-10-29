.class public Lcom/google/firebase/analytics/connector/AnalyticsConnector$ConditionalUserProperty;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/analytics/connector/AnalyticsConnector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ConditionalUserProperty"
.end annotation


# instance fields
.field public active:Z

.field public creationTimestamp:J

.field public expiredEventName:Ljava/lang/String;

.field public expiredEventParams:Landroid/os/Bundle;

.field public name:Ljava/lang/String;

.field public origin:Ljava/lang/String;

.field public timeToLive:J

.field public timedOutEventName:Ljava/lang/String;

.field public timedOutEventParams:Landroid/os/Bundle;

.field public triggerEventName:Ljava/lang/String;

.field public triggerTimeout:J

.field public triggeredEventName:Ljava/lang/String;

.field public triggeredEventParams:Landroid/os/Bundle;

.field public triggeredTimestamp:J

.field public value:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
