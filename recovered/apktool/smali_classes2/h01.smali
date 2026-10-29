.class public interface abstract Lh01;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/coroutines/CoroutineContext$Element;


# virtual methods
.method public abstract attachChild(Lcu;)Lzt;
.end method

.method public abstract cancel(Ljava/util/concurrent/CancellationException;)V
.end method

.method public abstract getCancellationException()Ljava/util/concurrent/CancellationException;
.end method

.method public abstract getChildren()Lkotlin/sequences/Sequence;
.end method

.method public abstract invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Le90;
.end method

.method public abstract invokeOnCompletion(ZZLkotlin/jvm/functions/Function1;)Le90;
.end method

.method public abstract isActive()Z
.end method

.method public abstract isCancelled()Z
.end method

.method public abstract isCompleted()Z
.end method

.method public abstract join(Lc10;)Ljava/lang/Object;
.end method

.method public abstract start()Z
.end method
