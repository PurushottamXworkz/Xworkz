package com.xworkz.fitnesscenter.dto;

import java.util.Objects;

public class FitnessCenterDto {
			
			private String nameOfFitnessCenter;
			private String nameOfTrainer;
			private String nameOfTrainee;
			private String address;
			private String reasonToJoin;
			
			public FitnessCenterDto() {
				System.out.println("--------------Constructor----------------");
			}

			public FitnessCenterDto(String nameOfFitnessCenter, String nameOfTrainer, String nameOfTrainee,
					String address, String reasonToJoin) {
				super();
				this.nameOfFitnessCenter = nameOfFitnessCenter;
				this.nameOfTrainer = nameOfTrainer;
				this.nameOfTrainee = nameOfTrainee;
				this.address = address;
				this.reasonToJoin = reasonToJoin;
			}

			public String getNameOfFitnessCenter() {
				return nameOfFitnessCenter;
			}

			public void setNameOfFitnessCenter(String nameOfFitnessCenter) {
				this.nameOfFitnessCenter = nameOfFitnessCenter;
			}

			public String getNameOfTrainer() {
				return nameOfTrainer;
			}

			public void setNameOfTrainer(String nameOfTrainer) {
				this.nameOfTrainer = nameOfTrainer;
			}

			public String getNameOfTrainee() {
				return nameOfTrainee;
			}

			public void setNameOfTrainee(String nameOfTrainee) {
				this.nameOfTrainee = nameOfTrainee;
			}

			public String getAddress() {
				return address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public String getReasonToJoin() {
				return reasonToJoin;
			}

			public void setReasonToJoin(String reasonToJoin) {
				this.reasonToJoin = reasonToJoin;
			}

			@Override
			public int hashCode() {
				return Objects.hash(address, reasonToJoin, nameOfFitnessCenter, nameOfTrainee, nameOfTrainer);
			}

			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				FitnessCenterDto other = (FitnessCenterDto) obj;
				return Objects.equals(address, other.address) && reasonToJoin == other.reasonToJoin
						&& Objects.equals(nameOfFitnessCenter, other.nameOfFitnessCenter)
						&& Objects.equals(nameOfTrainee, other.nameOfTrainee)
						&& Objects.equals(nameOfTrainer, other.nameOfTrainer);
			}

			@Override
			public String toString() {
				return "FitnessCenterDto [nameOfFitnessCenter=" + nameOfFitnessCenter + ", nameOfTrainer="
						+ nameOfTrainer + ", nameOfTrainee=" + nameOfTrainee + ", address=" + address + ", contact="
						+ reasonToJoin + "]";
			}
			
			
}
