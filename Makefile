# DAIKONDIR=${DAIKONDIR}
TARGET=$(target)

all: target

target:
	javac $(TARGET).java
	java -cp .:${DAIKONDIR}/daikon.jar daikon.DynComp $(TARGET) 
	java -cp .:${DAIKONDIR}/daikon.jar daikon.Chicory --daikon --comparability-file=$(TARGET).decls-DynComp $(TARGET) | tee -a "$(TARGET).txt"

clean:
	@rm -r *.class *.txt *.decls-DynComp *.inv.gz *.dtrace.gz